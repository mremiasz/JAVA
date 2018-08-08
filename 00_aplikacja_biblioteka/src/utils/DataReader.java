package utils;

import java.util.Scanner;
import data.Book;
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
        int number = sc.nextInt();
        sc.nextLine();
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
        int releaseDate = sc.nextInt();
        sc.nextLine();
        System.out.println("Ilość stron: ");
        int pages = sc.nextInt();
        sc.nextLine();

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
        int year = sc.nextInt();
        System.out.println("Miesiąc wydania: ");
        int month = sc.nextInt();
        sc.nextLine();
        System.out.println("Dzień wydania: ");
        int day = sc.nextInt();
        sc.nextLine();

        return new Magazine(title, publisher, language, year, month, day);
    }
}