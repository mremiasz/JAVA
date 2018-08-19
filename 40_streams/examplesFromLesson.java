import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class examplesFromLesson {
    public static void main(String[] args) {
        Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
        strings.map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());

        Stream<Integer> numStream = Stream.iterate(0, x -> x+1);
        //lista kwadratów kolejnych 100 liczb całkowitych
        List<Integer> squareNumbers = numStream.map(x -> x*x).limit(100).collect(Collectors.toList());

        squareNumbers.forEach(x -> System.out.println(x));
    }
}
