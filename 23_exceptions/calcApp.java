import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class calcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);
        double a = 0;
        double b = 0;
        String operator = null;

        boolean readComplete = false;
        while (!readComplete){
            try {
                System.out.println("Podaj pierwszą liczbę: ");
                a = input.nextDouble();
                input.nextLine();

                System.out.println("Podaj operatora arytmetycznego [+,-,/,*]: ");
                operator = input.nextLine();

                System.out.println("Podaj drugą liczbę: ");
                b = input.nextDouble();
                readComplete = true;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono nieprawidłowe dane, wprowadź jeszcze raz.");
                input.nextLine();
            }
        }

        Calculator calc = new Calculator();
        double result = 0;
        boolean calculationComplete = false;

        try {
            result = calc.calculate(a,b,operator);
            calculationComplete = true;
        }catch (ArithmeticException|UnkownOperatorException e) {
            System.err.println(e.getMessage());
        }

        if(calculationComplete) {
            System.out.println(a+operator+b+" = "+result);
        } else {
            System.out.println("Nie można obliczyć wyniku dla działania: "+ a+operator+b);
        }

        input.close();
    }
}
