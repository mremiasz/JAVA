import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class zadanie {
    public static void main(String[] args) {
        List<Integer>numbers = Stream.iterate(0,x-> x+1)
                .filter(x->x>100)
                .filter(x->x<1000)
                .filter(x->x%5==0)
                .limit(10)
                .map(x -> x*3)
                .collect(Collectors.toList());
        numbers.forEach(System.out::println);
    }
}
