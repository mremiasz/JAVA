package Kontroler;

public class TicketMachine {
    public static void buyTicket(Passenger pass, int timeMinutes){
        Ticket ticket = new Ticket(timeMinutes);
        pass.setTicket(ticket);
    }
}
