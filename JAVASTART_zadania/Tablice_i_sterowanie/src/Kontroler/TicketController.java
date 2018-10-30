package Kontroler;

import java.time.LocalDateTime;

public class TicketController {

    public static void main(String[] args) {
        Passenger[] passengers = new Passenger[4];

        passengers[0] = new Passenger("jan","nowak");
        passengers[1] = new Passenger("tomson","kowalski");
        passengers[2] = new Passenger("john","doe");
        passengers[3] = new Passenger("adam","plusa");

        TicketMachine.buyTicket(passengers[0],10);
        TicketMachine.buyTicket(passengers[1],30);
        Ticket invalidTicket = new Ticket(LocalDateTime.now().minusMinutes(20), 15);
        passengers[2].setTicket(invalidTicket);

        Passenger[] passengerBezBileciku = validateTickets(passengers);
        System.out.println("Bez biletu jedzie:");
        for (Passenger passenger : passengerBezBileciku) {
            System.out.println(passenger.getFirstName() + " " + passenger.getLastName());
        }
    }

    private static Passenger[] validateTickets(Passenger[] passengers){
        int bezBiletu = 0;
        for (Passenger pass: passengers){
            Ticket ticket = pass.getTicket();
            if (ticket==null || !ticket.isValid()){
                bezBiletu++;
            }
        }
        Passenger[] ludziBezBiletu = new Passenger[bezBiletu];

        for (int i = 0, j= 0; i < passengers.length;i++){
            Ticket ticket1 = passengers[i].getTicket();

            if (ticket1 == null || !ticket1.isValid()){
                ludziBezBiletu[j]=passengers[i];
                j++;
            }
        }
        return ludziBezBiletu;
    }

}
