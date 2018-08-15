package data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

public class Library implements Serializable {

    private static final long serialVersionUID = 8963852741894653156L;

    private static final int INITIAL_CAPACITY = 1;
    private Publication[] publications;
    private int publicationNumber;

    public int getPublicationNumber() {
        return publicationNumber;
    }

    public Publication[] getPublications() {
        return publications;
    }

    public Library() {
        publications = new Publication[INITIAL_CAPACITY];
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication pub) throws ArrayIndexOutOfBoundsException {
        if (publicationNumber == publications.length){
            publications = Arrays.copyOf(publications,publications.length*2);
        }
        publications[publicationNumber]=pub;
        publicationNumber++;
    }

    private void removePublication(Publication pub){
        if (pub == null)
            return;;

        final int NOT_FOUND = -1;
        int found = NOT_FOUND;
        int i =0;

        while (i<publications.length && found==NOT_FOUND){
            if (pub.equals(publications[i])){
                found = i;
            } else {
                i++;
            }
        }

        if (found != NOT_FOUND){
            System.arraycopy(publications,found +1,publications,found,publications.length-found-1);
            publicationNumber--;
        }
    }
    @Override
    public String toString() {
        StringBuilder printer = new StringBuilder();
        for (int i = 0; i < publicationNumber; i++){
            printer.append(publications[i]);
            printer.append("\n");
        }

        return printer.toString();
    }

    public static class AlphabeticComparator implements Comparator<Publication>{
        @Override
        public int compare(Publication p1, Publication p2){
            if (p1 == null && p2 == null){
                return 0;
            }

            if (p1 == null){
                return 1;
            }

            if (p2 == null){
                return -1;
            }

            return p1.getTitle().compareTo(p2.getTitle());
        }
    }

    public static class DateComparator implements Comparator<Publication>{
        @Override
        public int compare(Publication o1, Publication o2) {
            if (o1 == null && o2 == null){
                return 0;
            }

            if (o1 == null){
                return -1;
            }

            if (o2 == null){
                return 1;
            }

            Integer i1 = o1.getYear();
            Integer i2 = o2.getYear();
            return -i1.compareTo(i2);
        }
    }
}