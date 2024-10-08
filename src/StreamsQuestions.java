import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsQuestions {
    public static void main(String args[]) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 32, 15);
        int maxInt = myList.stream().max(Integer::compare).get();
        //System.out.println(maxInt);

        //System.out.println(firstNonRepeatingChar("geeksforgeeks"));

        //System.out.println(new StreamsQuestions().sortInDescendingOrder(myList));

        //System.out.println(new StreamsQuestions().secondLargest(myList));

      //  new StreamsQuestions().frequencyOfCharactersInString("karanprabhakar");

      //  new StreamsQuestions().numbersStartingWithOne(myList);

       // new StreamsQuestions().countOfChars("karanprabhakar");

      //  new StreamsQuestions().frequencyOfCharsInString("karanprabhakar");

        new StreamsQuestions().secondLargestInteger(myList);

        new StreamsQuestions().sortEmployee();

    }

    public static Character firstNonRepeatingChar(String s) {
        return s.chars()
                .mapToObj(i -> (char) i)
                .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
                .findFirst()
                .get();
    }

    public List<Integer> sortInDescendingOrder(List<Integer> list) {
        return list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
    }

    public Integer secondLargest(List<Integer> list){
        return list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get();
    }

    public void frequencyOfCharactersInString(String s){
        s.chars().mapToObj(i->(char)i)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)-> System.out.println(k+"-"+v));
    }

    //All numbers starting with 1
    public void numbersStartingWithOne(List<Integer> list){
        list.stream().map(s->s+"").filter(s->s.startsWith("1")).forEach(System.out::println);
    }

    public void countOfChars(String s){
        s.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(x->Collectors.counting()))
                .forEach((k,v)->System.out.println(k+""+v));
    }

    public void frequencyOfCharsInString(String s){
        s.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()

        )).forEach((k,v)->System.out.println(k+" "+v));
    }
    // second largest integer out of a list of integers
    public void secondLargestInteger(List<Integer> list){
        System.out.println(list.stream().sorted(Collections.reverseOrder()).skip(1).findFirst().get());
    }

    //Sort Employee using streams
    public void sortEmployee() {
        List<Employee> employees = new ArrayList<>();
        Employee e1 = new Employee("Ajay", 35);
        Employee e2 = new Employee("Vijay", 5);
        Employee e3 = new Employee("Zack", 30);
        Employee e4 = new Employee("David", 51);
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

       var result = employees.stream().sorted(Comparator.comparing(e->e.firstName)).collect(Collectors.toList());
               result.forEach(e->System.out.println(e.getFirstName()));

    }


    // group strings on its lengths


        public static void groupStringsByLength() {
            List<String> strings = Arrays.asList("apple", "bat", "cat", "dog", "elephant");
            Map<Integer, List<String>> groupedByLength = strings.stream()
                    .collect(Collectors.groupingBy(String::length));
            groupedByLength.forEach((length, strList) -> System.out.println(length + ": " + strList));
        }




}
