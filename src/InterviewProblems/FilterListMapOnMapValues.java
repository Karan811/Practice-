package InterviewProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterListMapOnMapValues {

    public void FilterMap() {
        List<Map<String, String>> collData = new ArrayList<>();

        // Add map 1
        Map<String, String> stuMap = new HashMap<>();
        stuMap.put("S1", "Course_1");
        stuMap.put("S2", "Course_2");
        stuMap.put("S3", "Course_1");
        stuMap.put("S4", "Course_2");
        stuMap.put("S5", "Course_1");
        stuMap.put(null, "College_A");
        collData.add(stuMap);

        // Add map 2
        stuMap = new HashMap<>();
        stuMap.put("Q1", "Course_1");
        stuMap.put("Q2", "Course_2");
        stuMap.put("Q3", "Course_1");
        stuMap.put("Q4", "Course_2");
        stuMap.put("Q5", "Course_1");
        stuMap.put(null, "College_B");
        collData.add(stuMap);

        // Filter using streams
        collData = collData.stream()
                .map(map -> map.entrySet().stream()
                        .filter(entry -> "Course_1".equals(entry.getValue()) || entry.getKey() == null)
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)))
                .collect(Collectors.toList());

        // Print the filtered maps
        collData.forEach(System.out::println);



















        collData= collData.stream().map(map->
        map.entrySet().stream()
                .filter(e->e.getValue().equals("Course_1"))
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue))
                ).collect(Collectors.toList());

        collData.forEach(System.out::println);
    }














}

