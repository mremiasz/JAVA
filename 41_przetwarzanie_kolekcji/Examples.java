import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Examples {
    public static final int DIVIDER = 10;

    public static void main(String[] args) {
        // lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = IntStream.range(0,  100)
                .map(Examples::square)
                .boxed()
                .collect(Collectors.toList());
        //zbiór kwadratów liczb
        Set<Integer> biggerThan5 = squareNumbers.stream()
                .filter(Examples::isDividedBy)
                .map(Examples::divide)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println("List");
        squareNumbers.forEach(System.out::println);
        System.out.println("\nSet");
        biggerThan5.forEach(System.out::println);

    }

    private static int square(int x) {
        return x*x;
    }

    private static boolean isDividedBy(int x) {
        return x%DIVIDER == 0;
    }

    private static int divide(int x) {
        return x/DIVIDER;
    }

}
