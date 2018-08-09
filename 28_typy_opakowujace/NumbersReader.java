import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReader {
    public static void main(String[] args) {
        String file = "liczby.txt";
        int a = 0;
        int b = 0;
        int c = 0;

        BigInteger aBig = null;
        BigInteger bBig = null;

        try(
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
        ) {

            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());
            aBig = new BigInteger(br.readLine());
            bBig = new BigInteger(br.readLine());

        } catch (FileNotFoundException e) {
            System.err.println("Nie znaleziono pliku");
        } catch (IOException e) {
            System.err.println("Błąd odczytu danych");
        }

        System.out.println("Suma a,b,c: " + (a+b+c));
        System.out.println("aBig + bBig = " + aBig.add(bBig));

    }
}
