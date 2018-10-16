public class Barman {
    static Drink createDrink(String ingredient1, double amount1,
                             String ingredient2, double amount2,
                             String ingredient3, double amount3){
        Ingredient ingr1 = new Ingredient(ingredient1,amount1);
        Ingredient ingr2 = new Ingredient(ingredient2,amount2);
        Ingredient ingr3 = new Ingredient(ingredient3,amount3);
        return new Drink(ingr1,ingr2,ingr3);
    }

    static void printDrink(Drink drink){
        double ingredientSum = drink.getIngredient1().getAmount()+
                drink.getIngredient2().getAmount()+
                drink.getIngredient3().getAmount();

        double part1 = drink.getIngredient1().getAmount()/ingredientSum;
        double part2 = drink.getIngredient2().getAmount()/ingredientSum;
        double part3 = drink.getIngredient3().getAmount()/ingredientSum;

        System.out.println("Składniki drinku to: "+drink.getIngredient1().getName() + ", " +
            drink.getIngredient2().getName() + ", " +
            drink.getIngredient3().getName() + " w proporcjach " + part1 + ", " + part2 + ", " + part3 + ", jego objętość to " +ingredientSum+".");
    }
}