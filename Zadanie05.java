import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Zadanie05 {
    private static void fillArray (long[][] tablica, int rows, int cols) throws FileNotFoundException {
        Random random = new Random();
        PrintWriter zapis = new PrintWriter("liczby.txt");
        if (rows >=0) {
            long[] row = new long[cols];
            for (int i = 0; i < row.length; i++) {
                row[i] = random.nextInt(100);
            }

            tablica[rows] = row;
//            zapis.println(Arrays.toString(row));
            fillArray(tablica, rows-1, cols);
        }
        zapis.println(Arrays.deepToString(tablica));
        zapis.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        long[][] arr = new long[15][5];
        fillArray(arr, arr.length-1,arr[0].length);
        System.out.println(Arrays.deepToString(arr));


    }
}