public class PaymentCalculator {
    public static String nettoYearPayment (Employee emp){
        return String.valueOf(emp.getMotnthWage()*12);
    }

    public static String bruttoYearPayment (Employee emp){
        return String.valueOf((emp.getMotnthWage()/0.8)*12+12*1000);
    }
}
