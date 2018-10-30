import java.math.BigDecimal;
import java.util.Scanner;

public class PrecyzjaLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double liczba = scanner.nextDouble();
        scanner.close();
        BigDecimal n = BigDecimal.valueOf(liczba);
        if (liczba>0) {
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(n)<=0; i=i.add(BigDecimal.valueOf(0.1))){
                System.out.println(i.toString() + " ");
            }
        }else {
            for (BigDecimal i = BigDecimal.ZERO; i.compareTo(n)>=0;i=i.subtract(BigDecimal.valueOf(0.1))){
                System.out.println(i.toString() + " ");
            }
        }
    }
}
