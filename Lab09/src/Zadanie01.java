import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Zadanie01 {
    static class People {
        Country country;
        Hobby hobby;
        String name;
        double salary;

        enum Country {
            Poland, German;
        }

        enum Hobby {
            Dance, Tennis;
        }

        public People(Country country, Hobby hobby, String name, double salary) {
            this.country = country;
            this.hobby = hobby;
            this.name = name;
            this.salary = salary;
        }

        static List<People> populate() {
            return Arrays.asList(
                    new People(People.Country.Poland, People.Hobby.Dance, "Jan", 2400),
                    new People(People.Country.Poland, People.Hobby.Dance, "Marek", 2600),
                    new People(People.Country.German, People.Hobby.Tennis, "Paul", 4000),
                    new People(People.Country.German, People.Hobby.Dance, "Jan2", 500),
                    new People(People.Country.German, People.Hobby.Tennis, "Tom", 3000)
            );
        }
        @Override
        public String toString(){
            return name + ", " + country + ", " + hobby + ", " + salary;
        }

        public Hobby getHobby(){
            return hobby;
        }
        public Country getCountry(){
            return country;
        }

        public boolean isDance (Hobby hobby) {
            return this.hobby.equals(Hobby.Dance);
        }
        public boolean isTennis (Hobby hobby) {
            return this.hobby.equals(Hobby.Tennis);
        }
        public boolean isGerman (Country country) {
            return this.country.equals(Country.German);
        }
    }

    public static void main(String[] args) {

        List<People> lista = People.populate();
        //lista.stream().forEach(System.out::println);
        System.out.println("****************************************");
        System.out.println("Tennis: " +
                lista.stream().filter(
                        People -> {People.getHobby();
                            return People.isTennis(Zadanie01.People.Hobby.Dance);
                        }
                ).count()
        );
        System.out.println("****************************************");
        System.out.println("Kto tanczy: ");
        Predicate tancerze = People -> People.getClass().equals(Zadanie01.People.Hobby.Dance);
        lista.stream().filter(tancerze).forEach(System.out::println);

        System.out.println("****************************************");
        lista.stream().filter(
                People -> {People.getHobby();
                    return People.isDance(Zadanie01.People.Hobby.Dance);
                }
        ).forEach(System.out::println);
        System.out.println("****************************************");
        System.out.println("Tanczacy Niemcy: ");
        lista.stream().filter(
                People -> {People.getHobby();
                    return People.isDance(Zadanie01.People.Hobby.Dance);
                }
        ).filter(People -> {People.getCountry();
                    return People.isGerman(Zadanie01.People.Country.German);
                }
        ).forEach(System.out::println);
    }
}