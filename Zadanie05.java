import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;


public class Zadanie05 {
    static void druk(double[][] array) {
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat formatter = (DecimalFormat)nf;

        for (int i = 0; i < array.length; i++) {
            if(i==0) {
                System.out.println("Srednia dla kolumn: ");
            } else {
                    System.out.println("Srednia dla rzedow: ");
            }
            for (int j = 0; j < array[i].length; j++)
                System.out.format("%.1f ",array[i][j]);
            System.out.println();


        }
    }

    static void fillArray (long[][] tablica, int rows, int cols) throws IOException {
        Random random = new Random();
        PrintWriter zapis = new PrintWriter(new BufferedWriter(new FileWriter("liczby.txt", true)));


        if (rows >=0) {
            long[] row = new long[cols];
            for (int i = 0; i < row.length; i++) {
                row[i] = random.nextInt(1000);
            }

            tablica[rows] = row;
            zapis.println(Arrays.toString(row));
            fillArray(tablica, rows-1, cols);
        }
        zapis.close();
    }

    static double[][] calcAverages (String nazwaPlikWe,int row, int col) throws IOException {
        double[][] array = null;

        DataInputStream inputFile = new DataInputStream(new FileInputStream(nazwaPlikWe));
        BufferedReader inputBr = new BufferedReader(new InputStreamReader(inputFile));

        String line;
        String[] tablica;

        array = new double[row][col];
        for (int k = 0; k < row; k++){
            line = inputBr.readLine();
            tablica = line.substring(1, line.length()-1).replaceAll(" ","").split(",");
            for (int l = 0; l < col; l++){
                array[k][l] = Double.parseDouble(tablica[l]);
            }
        }

        double[][] res = new double[2][];

        res[0] = new double[col];
        res[1] = new double[row];

        for (int c = 0; c < row; c++) {
            for (int d = 0; d < col; d++) {
                res[0][d] += array[c][d] / row;
                res[1][c] += array[c][d] / col;
            }
        }

        return res;
    }

    public static void main(String[] args) throws IOException {

        long[][] arr = new long[3][5];

        try {
            fillArray(arr, arr.length-1,arr[0].length);

        } catch (IOException e) {
            e.printStackTrace();
        }
        druk(calcAverages("liczby.txt", arr.length,arr[0].length));
    }
}