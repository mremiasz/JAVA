package BarmanV2;

import java.util.Scanner;

public class Barman {

    private static Scanner sc = new Scanner(System.in);

    public static Drink createDrink(){
        System.out.println("Podaj ilość składników:");
        int ingredientNumber = sc.nextInt();

        sc.nextLine();
        Ingredient[] ingredients = new Ingredient[ingredientNumber];

        for (int i = 0; i < ingredientNumber; i++){
            ingredients[i] = createIngredient();
        }
        return new Drink(ingredients);
    }

    public static Ingredient createIngredient(){
        System.out.println("Podaj nazwę składnika:");
        String ingredientName = sc.nextLine();

        System.out.println("Podaj ilość "+ingredientName);
        double ingredientAmount = sc.nextDouble();

        sc.nextLine();

        return new Ingredient(ingredientName,ingredientAmount);
    }

    static void printDrink(Drink drink){
        Ingredient[] ingredients = drink.getIngredients();
        System.out.print("Liczba składników to: " + ingredients.length + "\n");

        for (Ingredient ing: ingredients){
            System.out.printf(" - %s (%.0f)\n", ing.getName(), ing.getAmount());
        }
    }
}
