public class EmployeeTescik {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Michal","Nowak",5000);

        String netto1 = PaymentCalculator.nettoYearPayment(emp1);
        String brutto1 = PaymentCalculator.bruttoYearPayment(emp1);

        System.out.println(emp1);
        System.out.println(netto1);
        System.out.println(brutto1);
    }
}
