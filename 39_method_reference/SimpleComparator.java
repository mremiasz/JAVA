import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arutr","Darek","Łukasz","Przemek","Kamil","Natalia");

        Collections.sort(names,String::compareToIgnoreCase);

        for (String name: names){
            System.out.println(name);
        }
    }
}
