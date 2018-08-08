import java.io.Serializable;

public class Person implements Serializable {
    private static final long UID = 5648913168491319L;

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person () {}

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
