import java.util.*;

public class SortMapByValues {


    public static void main(String args[]){
        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1, "karan");
        hm.put(2, "Neha");
        hm.put(3, "Aradhya");
        hm.put(4, "Anchal");
        hm.put(5, "maa");

        sortHm(hm);
    }
    public static void sortHm(HashMap<Integer,String> hm) {
        List<Map.Entry<Integer,String>> list = new LinkedList<Map.Entry<Integer,String> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        HashMap<Integer,String> temp = new HashMap<Integer,String>();
        for(Map.Entry<Integer,String> aa:list){
            temp.put(aa.getKey(),aa.getValue());
        }

        for (Map.Entry<Integer,String> en : temp.entrySet()) {
            System.out.println("Key = " + en.getKey() +
                    ", Value = " + en.getValue());
        }

        //System.out.println("Sorted list "+list);
    }
}
