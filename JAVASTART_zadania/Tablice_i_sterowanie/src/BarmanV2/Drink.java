package BarmanV2;

public class Drink {
    private Ingredient[] ingredients;

    public Drink(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredient[] ingredients) {
        this.ingredients = ingredients;
    }
}