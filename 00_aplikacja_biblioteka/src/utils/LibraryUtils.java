package utils;

import data.Book;
import data.Library;
import data.Magazine;
import data.Publication;

import java.util.Arrays;

public class LibraryUtils {
    public static void printBooks(Library lib) {
        Publication[] publications = lib.getPublications();
        Arrays.sort(publications,new Library.AlphabeticComparator());

        int publicationNumber = lib.getPublicationNumber();
        int countBooks = 0;

        for (int i = 0; i<publicationNumber; i++){
            if (publications[i] instanceof Book){
                System.out.println(publications[i]);
                countBooks++;
            }
        }

        if(countBooks==0){
            System.out.println("Brak książek w bibliotece.");
        }
    }

    public static void printMagazines(Library lib) {
        Publication[] publications = lib.getPublications();
        Arrays.sort(publications,new Library.DateComparator());

        int publicationsNumber = lib.getPublicationNumber();
        int countMahazines = 0;

        for (int i =0; i< publicationsNumber;i++){
            if(publications[i] instanceof Magazine){
                System.out.println(publications[i]);
                countMahazines++;
            }
        }

        if(countMahazines==0){
            System.out.println("Brak magazynów w bibliotece.");
        }
    }
}
