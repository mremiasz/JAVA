import java.util.Arrays;

public class personDatabase {
    private final int INITIAL_CAPCITY = 1;
    private Person[] persons;
    private int emptyPlace;

    public personDatabase() {
        persons = new Person[INITIAL_CAPCITY];
        emptyPlace = 0;
    }

    public void add(Person p){
        if (emptyPlace == persons.length){
            persons = Arrays.copyOf(persons,persons.length*2);
        }
        persons[emptyPlace]=p;
        emptyPlace++;
    }

    public void remove(Person p) {
        if(p == null)
            return;

        final int NOT_FOUND = -1;
        int found = NOT_FOUND;
        int i =0;

        while (i < persons.length && found == NOT_FOUND) {
            if(p.equals(persons[i])){
                found = i;
            } else  {
                i++;
            }
        }

        if (found != NOT_FOUND){
            System.arraycopy(persons,(found+1),persons, found,(persons.length - found-1));
            emptyPlace--;
        }
    }

    public Person get(int index){
        if ( index >= emptyPlace || index < 0){
            throw new ArrayIndexOutOfBoundsException("Błedny parametr");
        }

        return persons[index];
    }

    public int size() {
        return emptyPlace;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rozmiar bazy danych: " +size());
        sb.append("\n");

        for (int i = 0; i < emptyPlace; i++){
            sb.append(persons[i].toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}