import java.io.*;

public class Zadanie04 {
    private static void emerytura(String nazwaPliku) throws IOException {
        DataInputStream inputFile = new DataInputStream(new FileInputStream(nazwaPliku));
        BufferedReader inputBr = new BufferedReader(new InputStreamReader(inputFile));

        PrintWriter zapisM = new PrintWriter("mezczyzni.txt");
        PrintWriter zapisK = new PrintWriter("kobiety.txt");
        zapisM.println("Nazwisko Imię \"Lata do emerytury\"");
        zapisK.println("Nazwisko Imię \"Lata do emerytury\"");

        try {
            for (String line2 = inputBr.readLine(); line2 != null; line2 = inputBr.readLine()) {
                String[] line = line2.split(" ");
                if (line[2].equalsIgnoreCase("M")){
                    zapisM.println(line[1]+ " " +line[0]+ " " +(67-Integer.valueOf(line[3])));
                } else {
                    zapisK.println(line[1]+ " " +line[0]+ " " +(65-Integer.valueOf(line[3])));
                }
            }
            zapisM.close();
            zapisK.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        emerytura("test.txt");
    }
}