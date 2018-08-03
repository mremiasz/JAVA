public class hospital {
    public static final int MAX_EMPLOYEES = 3;

    private person[] employees;
    private int employeesNumber;

    public person[] getEmployees() {
        return employees;
    }

    public void setEmployees(person[] employees) {
        this.employees = employees;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public hospital(){
        setEmployees(new person[MAX_EMPLOYEES]);
        setEmployeesNumber(0);
    }

    public void add(person osoba) {
        if (getEmployeesNumber()< MAX_EMPLOYEES) {
            getEmployees()[getEmployeesNumber()] = osoba;
            setEmployeesNumber(getEmployeesNumber()+1);
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < employeesNumber; i++){
            result = result + employees[i] + "\n";
        }
        return result;
    }
}
