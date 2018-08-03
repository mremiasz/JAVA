public class person {
    private String firstName;
    private String lastName;
    private double salary;
    private int age;

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public person (String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }

    public String toString() {
        return "Imię: " + firstName + ", nazwisko: " + lastName + ", wiek: " + age + ", pensja: " + salary;
    }
}
