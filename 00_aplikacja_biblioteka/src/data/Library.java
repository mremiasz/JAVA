package data;

import java.io.Serializable;

public class Library implements Serializable {
    private static final long serialVersionUID = 8963852741894653156L;
    public static final int MAX_PUBLICATIONS = 1000;
    private Publication[] publications;
    private int publicationNumber;

    public int getPublicationNumber() {
        return publicationNumber;
    }

    public Publication[] getPublications() {
        return publications;
    }

    public Library() {
        publications = new Publication[MAX_PUBLICATIONS];
    }

    public void addBook(Book book) {
        addPublication(book);
    }

    public void addMagazine(Magazine magazine) {
        addPublication(magazine);
    }

    private void addPublication(Publication pub) throws ArrayIndexOutOfBoundsException {
        if (publicationNumber == MAX_PUBLICATIONS){
            throw new ArrayIndexOutOfBoundsException("Max publications: " + MAX_PUBLICATIONS);
        }
        publications[publicationNumber]=pub;
        publicationNumber++;
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
}
