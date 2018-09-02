package utils;

import data.*;

import java.util.*;

public class LibraryUtils {
    public static void printBooks(Library lib) {
        printPublications(lib,Book.class);
    }

    public static void printMagazines(Library lib) {
        printPublications(lib,Magazine.class);
    }

    private static void printPublications(Library lib, Class cl){
        long counter = lib.getPublications().values().stream()
                .filter(cl::isInstance)
                .sorted(new Library.AlphabeticComparator())
                .peek(System.out::println)
                .count();

        if (counter == 0){
            System.out.println("W biblitece nie ma publikacji typu " + cl.getSimpleName());
        }
    }

    public static void printUsers(Library lib){
        lib.getUsers().values().stream()
                .sorted(Comparator.comparing(User::getLastName))
                .forEach(System.out::println);
    }
}
