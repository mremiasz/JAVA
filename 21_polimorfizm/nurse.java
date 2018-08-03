public class nurse extends person{
    private double bonus;
    private double overtime;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public nurse(String firstName, String lastName, int age, double salary, double bonus, double overtime) {
        super(firstName, lastName, age, salary);
        setBonus(bonus);
        setOvertime(overtime);
    }

    public String toString() {
        return super.toString()+ ", premia: " + bonus + ", nadgodziny: " + overtime;
    }
}
