import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadanie03 {
    private static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String slowo) throws FileNotFoundException {
        String regex = ".*"+slowo+".*";
        Pattern pattern = Pattern.compile(regex);

        try (
                DataInputStream inputFile = new DataInputStream(new FileInputStream(nazwaPlikWe));
                BufferedReader inputBr = new BufferedReader(new InputStreamReader(inputFile));
        ) {

            PrintWriter zapis = new PrintWriter(nazwaPlikWy);
            int counter = 0;
            for (String line = inputBr.readLine(); line != null; line = inputBr.readLine()){
                counter++;
                Matcher matcher = pattern.matcher(line);
                boolean matches = matcher.matches();

                if (  matches ) {
                    zapis.println(counter+": " + line);
                }
            }
            zapis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        szukaj("test.txt", "odpowiedz.txt", "egzamin");
    }
}