package utils;

import java.util.InputMismatchException;
import java.util.Scanner;
import data.Book;
import data.LibraryUser;
import data.Magazine;

public class DataReader {
    private Scanner sc;

    public DataReader() {
        sc = new Scanner(System.in);
    }

    public void close() {
        sc.close();
    }

    public int getInt() {
        int number = 0;
        try{
            number = sc.nextInt();
        }catch (InputMismatchException e){
            throw new NumberFormatException("Liczba wprowadzaona w niepoprawnym formacie");
        } finally {
            sc.nextLine();
        }
        return number;
    }

    public Book readAndCreateBook() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Autor: ");
        String author = sc.nextLine();
        System.out.println("Wydawnictwo: ");
        String publisher = sc.nextLine();
        System.out.println("ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Rok wydania: ");
        int releaseDate = 0;
        int pages = 0;
        try {
            releaseDate = sc.nextInt();
            sc.nextLine();
            System.out.println("Ilość stron: ");
            pages = sc.nextInt();
            sc.nextLine();
        }catch (InputMismatchException e){
            sc.nextLine();
            throw e;
        }
        return new Book(title, author, releaseDate, pages, publisher, isbn);
    }

    public Magazine readAndCreateMagazine() {
        System.out.println("Tytuł: ");
        String title = sc.nextLine();
        System.out.println("Język: ");
        String language = sc.nextLine();
        System.out.println("Wydawca: ");
        String publisher = sc.nextLine();
        System.out.println("Rok wydania: ");
        int year = 0;
        int month = 0;
        int day = 0;
        try {
            year = sc.nextInt();
            sc.nextLine();
            System.out.println("Miesiąc: ");
            month = sc.nextInt();
            sc.nextLine();
            System.out.println("Dzień: ");
            day = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e) {
            sc.nextLine();
            throw e;
        }
        return new Magazine(title, publisher, language, year, month, day);
    }

    public LibraryUser readAndCreateLibraryUser(){
        System.out.println("Imię: ");
        String fn = sc.nextLine();
        System.out.println("Nazwisko: ");
        String ln = sc.nextLine();
        System.out.println("Pesel: ");
        String pesel = sc.nextLine();

        return new LibraryUser(fn,ln,pesel);
    }
}
