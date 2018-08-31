import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class zadanie {
    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "text.txt";
        BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
        List<String> words = new ArrayList<>();
        String tmp = null;
        Instant i1 = Instant.now();
        while ((tmp = br.readLine())!=null){
            words.addAll(Arrays.asList(tmp.split(" ")));
        }

        words = words.stream().map(s -> s.replaceAll(",","").replaceAll("\\.",""))
                .collect(Collectors.toList());

        long countSwords = words.stream().filter(s -> s.startsWith("s"))
                .peek(s -> System.out.print(s + " ")).count();

        System.out.println();

        long fiveLetters = words.stream().filter(s -> s.length()==5)
                .peek(s -> System.out.print(s+" ")).count();

        System.out.println();
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1, i2);
        System.out.println("Upłynęło : " + duration.getNano()/1000000 + " milisekund");

        System.out.println("Liczba wyrazów na 's': " + countSwords);
        System.out.println("Liczba wyrazów z 5 literami: " + fiveLetters);

        br.close();
    }
}
