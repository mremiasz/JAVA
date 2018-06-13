import java.io.*;

public class Zadanie02_liczZnakiSlowa {
    public static void main(String[] args) throws IOException {
        int lines = 0;
        int whiteSpaces = 0;
        String line;

        try (
        DataInputStream input = new DataInputStream(new FileInputStream("test.txt"));
        ) {
            while (input.readUTF() != null) {
                line = input.readUTF();
                lines++;
                whiteSpaces += line.length() - line.replaceAll(" ", "").length();
            }
        } catch (EOFException ex) {
            System.out.println("Odczytano cały plik.");
        }
        System.out.println("Linie: "+lines +"\nSpacje: "+whiteSpaces);
    }
}