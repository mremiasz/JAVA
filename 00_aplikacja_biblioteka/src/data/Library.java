package data;

public class Library {

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

    private void addPublication(Publication pub) {
        if (publicationNumber<MAX_PUBLICATIONS){
            publications[publicationNumber]=pub;
            publicationNumber++;
        } else {
            System.out.println("Max liczba publikacji została osiągnięta.");
        }
    }

    public void printBooks() {
        int countBooks = 0;
        for (int i = 0; i < publicationNumber; i++){
            if (publications[i] instanceof Book){
                System.out.println(publications[i]);
                countBooks++;
            }
        }

        if (countBooks == 0){
            System.out.println("Brak książek w bibliotece.");
        }
    }

    public void printMagazines() {
        int countMagazines = 0;
        for (int i = 0; i < publicationNumber; i++){
            if (publications[i] instanceof Magazine){
                System.out.println(publications[i]);
                countMagazines++;
            }
        }

        if (countMagazines == 0){
            System.out.println("Brak magazynów w bibliotece.");
        }
    }
}
