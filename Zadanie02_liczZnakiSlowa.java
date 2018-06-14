import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zadanie02_liczZnakiSlowa {
    public static void main(String[] args) throws IOException{

        long lines = 0;
        long marks = 0;
        long delimeters = 0;
        long words = 0;
        long whitespaces = 0;

        String pattern1 = "[\\r\\s\\n\\t]";
        String pattern2 = "[\\\\s\\\\r\\\\n\\\\t]";

        List<String> myList;

        try (
                DataInputStream inputFile = new DataInputStream(new FileInputStream("test.txt"));
                BufferedReader inputBr = new BufferedReader(new InputStreamReader(inputFile));
        ) {

            for (String line = inputBr.readLine(); line != null; line = inputBr.readLine()) {
                lines++;
                whitespaces += (line.length() -  line.replaceAll(pattern1, "").length());
                delimeters  += (line.length() -  line.replaceAll(pattern2, "").length())/2;

                marks += line.length();
                myList = new ArrayList<String>(Arrays.asList(line.replaceAll(pattern2, "").split(pattern1)));
                myList.removeAll(Arrays.asList("", null));
                words += myList.size();
            }
        }
        //druga metoda liczenia lini w pliku
        Path path = Paths.get("test.txt");
        long lineCount = Files.lines(path).count();

        System.out.println("Linie: "+ lines +" "+ lineCount+
                            "\nZnaki (z białymi włącznie): "+ marks +
                            "\nSlowa: "+ words +
                            "\nBiałe znaki: "+ whitespaces +
                            "\nSymbole (\\r, \\t, \\n, \\s): " + delimeters);
    }
}
