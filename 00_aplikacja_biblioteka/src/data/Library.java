package data;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Library implements Serializable {

    private static final long serialVersionUID = 8963852741894653156L;

    private static final int INITIAL_CAPACITY = 1;
    private Map<String,Publication> publications;
    private Map<String,LibraryUser>users;

    public int getPublicationNumber() {
        return publications.size();
    }

    public Map<String, Publication> getPublications() {
        return publications;
    }

    public Map<String, LibraryUser> getUsers() {
        return users;
    }

    public Library() {
        publications = new HashMap<>();
        users = new HashMap<>();
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication pub) {
        publications.put(pub.getTitle(),pub);
    }

    public void addUser(LibraryUser user){
        users.put(user.getPesel(),user);
    }

    private void removePublication(Publication pub){
        if (publications.containsValue(pub)){
            publications.remove(pub.getTitle());
        }
    }
    @Override
    public String toString() {
        StringBuilder printer = new StringBuilder();
        for(Publication p: publications.values()) {
            printer.append(p);
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