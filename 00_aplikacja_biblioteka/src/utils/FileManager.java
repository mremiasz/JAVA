package utils;

import data.Library;

import java.io.*;

public class FileManager {
    public static final String FILE_NAME = "Library.out";

    public void writeLibraryToFile(Library lib){
        try (
                FileOutputStream fos = new FileOutputStream(FILE_NAME);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                ) {
            oos.writeObject(lib);
        } catch (FileNotFoundException e) {
            System.err.println("Nie odnaleziono pliku "+FILE_NAME);
        } catch (IOException e) {
            System.err.println("Bład podczas zapisu danych do pliku "+FILE_NAME);
        }
    }


    public Library readLibraryFromFile() throws IOException, ClassNotFoundException {
        Library library = null;

        try(
                FileInputStream fis = new FileInputStream(FILE_NAME);
                ObjectInputStream ois = new ObjectInputStream(fis);
                ) {
            library = (Library)ois.readObject();
        }catch (FileNotFoundException e){
            System.err.println("Nie odnaleziono pliku " + FILE_NAME);
            throw e;
        } catch (IOException e ){
            System.err.println("Bład podczas odczytu danych z pliku " + FILE_NAME);
            throw e;
        }catch (ClassNotFoundException e) {
            System.err.println("Nieprawidłowy format pliku.");
            throw e;
        }

        return library;
    }
}
