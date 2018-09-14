package pl.sjmprofil.decorator.coffeShop.decorations;

import pl.sjmprofil.decorator.coffeShop.CoffeeDrink;

public class Carmel extends Ingredient {

    CoffeeDrink coffeeDrink;

    public Carmel(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getDescription() {
        return coffeeDrink.getDescription() + " with carmel";
    }

    @Override
    public double cost() {
        return coffeeDrink.cost() + 1.10;
    }
}
