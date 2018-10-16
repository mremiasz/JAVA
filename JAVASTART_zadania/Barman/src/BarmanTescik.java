public class BarmanTescik {

    public static void main(String[] args) {
        Drink drink1 = Barman.createDrink(
                "Amaretto",100,
                "wodka",50,
                "sok pomaranczowy", 250);

        Barman.printDrink(drink1);
    }
}
