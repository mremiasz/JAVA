public class Employee {
    private String name;
    private String surname;
    private int monthWage;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", monthWage=" + monthWage +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMotnthWage() {
        return monthWage;
    }

    public void setMotnthWage(int monthWage) {
        this.monthWage = monthWage;
    }

    public Employee(String name, String surname, int monthWage) {
        this.name = name;
        this.surname = surname;
        this.monthWage = monthWage;
    }
}
