import java.util.*;
import java.util.stream.*;

public class StreamDemo {
    public static void main(String args[]){

        //Make a list of numbers
        List<Integer> number = Arrays.asList(2,3,4,5);

        //Using stream API with map method, convert each number to its square then return the collection using collect method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        //Make a list of String
        List<String> names = Arrays.asList("College","University","Higher Education");

        //use Filter method to filter elements in list with a particular condition
        List<String> filteredNames = names.stream().filter(s->s.startsWith("C")).collect(Collectors.toList());
        System.out.println(filteredNames);

        //use sort method to sort elements in list alphabetically
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNames);

        //use of foreach to print
        number.stream().map(x->x*x).forEach(y->System.out.println(y));

    }

}
