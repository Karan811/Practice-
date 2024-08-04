import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class FindDuplicates {

   public Set<Integer> findDuplicates(List<Integer> li){
       Set<Integer> items = new HashSet<Integer>();
          return li.stream()
                  .filter(n->!items.add(n))
                  .collect(Collectors.toSet());
   }



   public List<Integer> findDuplicates1(List<Integer> li){
       return li.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
               .entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).collect(Collectors.toList());
   }

    public static void main(String[] args) {
        FindDuplicates obj = new FindDuplicates();
        List<Integer> li = Arrays.asList(1,2,2,4,5,3,3,5,6,7,4);
        System.out.println("Duplicate integers -"+obj.findDuplicates(li));


    }
}