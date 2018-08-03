public class hospitalApp {
    public static void main(String[] args) {
        hospital hospital1 = new hospital();
        hospital1.add(new doctor("Tomasz", "Nowak", 35, 6000, 10));
        hospital1.add(new doctor("Adrian", "Kowalski", 55, 12000, 15));
        hospital1.add(new nurse("Marlena", "Kocioł", 30, 5000, 5, 25));

        System.out.println("Pracownicy szpitala:");
        System.out.println(hospital1);
    }
}
