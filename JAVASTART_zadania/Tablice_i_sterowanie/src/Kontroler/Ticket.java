package Kontroler;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private final LocalDateTime czasZakupu;
    private final int czasWaznosci;

    public Ticket(int czasWaznosci) {
        this(LocalDateTime.now(),czasWaznosci);
    }

    public Ticket(LocalDateTime czasZakupu, int czasWaznosci) {
        this.czasZakupu = czasZakupu;
        this.czasWaznosci = czasWaznosci;
    }

    public LocalDateTime getCzasZakupu() {
        return czasZakupu;
    }

    public int getCzasWaznosci() {
        return czasWaznosci;
    }

    public boolean isValid(){
        LocalDateTime curent = LocalDateTime.now();
        Duration duration = Duration.between(czasZakupu,curent);
        return duration.toMinutes() < czasWaznosci;
    }
}
