import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class stoper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wcisnij ENTER aby rozpocząć odliczanie test.");
        sc.nextLine();
        Instant i1 = Instant.now();

        System.out.println("Wciśnij ENTER aby zatrzymać pomiar.");
        sc.nextLine();
        Instant i2 = Instant.now();

        Duration time = Duration.between(i1,i2);
        System.out.println("Czas który upłynął [sec]: " + time.getSeconds());
    }
}
