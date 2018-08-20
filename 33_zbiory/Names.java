import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class Names {
    public static void main(String[] args) throws IOException {
        FileReader input = new FileReader("namespl.txt");
        BufferedReader reader = new BufferedReader(input);
    //treeSet - gwarantuje unikalność elementów oraz automatyczne sortowanie w momencie dodawanie elementów;
        TreeSet<String> names = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        String name;
        while ((name = reader.readLine())!=null && name.length()>= 1){
            names.add(name);
        }

        reader.close();

        System.out.println("Ilość unikalnych imion w pliku: " + names.size());
        System.out.println("Pierwsze imię: " + names.first());
        System.out.println("Ostatnie imię: " + names.last());
    }
}
