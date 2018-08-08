import java.io.Serializable;

public class Company implements Serializable {
    private static final long UID = 951655879632154996L;
    public static final int EMPLOYEES = 3;
    private Employee[] employees;

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Company() {
        employees = new Employee[EMPLOYEES];
    }

    public void add(Employee emp, int index){
        employees[index]=emp;
    }
}
