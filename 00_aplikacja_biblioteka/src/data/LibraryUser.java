package data;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser extends User {

    private static final long serialVersionUID = 897654321963852741L;

    private List<Publication>publicationHistory;
    private List<Publication>borrowedPublications;

    public List<Publication> getPublicationHistory() {
        return publicationHistory;
    }

    public List<Publication> getBorrowedPublications() {
        return borrowedPublications;
    }

    public LibraryUser(String firstName, String lastName, String pesel) {
        super(firstName, lastName, pesel);
        publicationHistory = new ArrayList<>();
        borrowedPublications = new ArrayList<>();
    }

    private void addPublicationToHistory(Publication pub){
        publicationHistory.add(pub);
    }

    public void borrowPublication(Publication pub){
        borrowedPublications.add(pub);
    }

    public boolean returnPublication(Publication pub){
        boolean result = false;
        if (borrowedPublications.remove(pub)){
            result=true;
            addPublicationToHistory(pub);
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        LibraryUser that = (LibraryUser) o;

        if (publicationHistory != null ? !publicationHistory.equals(that.publicationHistory) : that.publicationHistory != null)
            return false;
        return borrowedPublications != null ? borrowedPublications.equals(that.borrowedPublications) : that.borrowedPublications == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (publicationHistory != null ? publicationHistory.hashCode() : 0);
        result = 31 * result + (borrowedPublications != null ? borrowedPublications.hashCode() : 0);
        return result;
    }
}
