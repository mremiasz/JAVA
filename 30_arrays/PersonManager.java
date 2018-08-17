public class PersonManager {
    public static void main(String[] args) {
        personDatabase data = new personDatabase();
        data.add(new Person("Anna","Nowak", 96581));
        data.add(new Person("Anna2","Nowak2", 96582));
        data.add(new Person("Anna3","Nowak3", 96583));

        System.out.println(data);

        data.remove(new Person("Anna2","Nowak2", 96582));

        System.out.println("**********************");
        System.out.println(data);
    }
}
