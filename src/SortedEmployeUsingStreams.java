import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEmployeUsingStreams {

    public static void main(String args[]) {
        SortedEmployeUsingStreams obj = new SortedEmployeUsingStreams();



        List<Person> people = new ArrayList<>();
        people.add(new Person("John", "Doe"));
        people.add(new Person("Jane", "Smith"));
        people.add(new Person("Emily", "Jones"));
        people.add(new Person("Michael", "Brown"));

        // Sort the list by last name using a lambda expression
        people.sort((p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Print the sorted list
        people.forEach(System.out::println);
    }
}
