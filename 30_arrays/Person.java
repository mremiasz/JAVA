public class Person {
    private String firstName;
    private String lastName;
    private double pesel;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public double getPesel() {
        return pesel;
    }

    public void setPesel(double pesel) {
        this.pesel = pesel;
    }

    public Person(String firstName, String lastName, double pesel) {
        setLastName(lastName);
        setFirstName(firstName);
        setPesel(pesel);
    }

    @Override
    public String toString() {
        return "Person [firstName = " + firstName + ", lastName = " + lastName + ", pesel = " + pesel + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj==null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;

        Person otherPerson = (Person) obj;
        if (this.firstName == null){
            if (otherPerson.firstName != null)
                return false;
        } else if (!firstName.equals(otherPerson.firstName))
            return false;

        if (this.lastName == null){
            if (otherPerson.lastName != null)
                return false;
        } else if (!lastName.equals(otherPerson.lastName))
            return false;

        if (this.pesel == Double.NaN){
            if (otherPerson.pesel != Double.NaN)
                return false;
        } else if (pesel != (otherPerson.pesel))
            return false;
        return true;
    }
}
