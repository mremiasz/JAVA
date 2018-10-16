public class CabrioModel {
    public static void main(String[] args) {
        Cabrio c1 = new Cabrio("Audi","A4");
        System.out.println(c1);

        Cabrio c2 = new Cabrio("BMW", "M4");
        Cabrio c3 = new Cabrio("BMW", "M6");
        System.out.println(c2);
        System.out.println(c3);
        c3.setMoving(true);
        c3.setRoofOpen(true);
        System.out.println(c3);
    }
}
