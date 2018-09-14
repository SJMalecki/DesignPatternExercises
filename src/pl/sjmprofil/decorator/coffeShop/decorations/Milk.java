package pl.sjmprofil.decorator.coffeShop.decorations;

import pl.sjmprofil.decorator.coffeShop.CoffeeDrink;

public class Milk extends Ingredient {

    CoffeeDrink coffeeDrink;

    public Milk(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getDescription() {
        return coffeeDrink.getDescription() + " with milk";
    }

    @Override
    public double cost() {
        return coffeeDrink.cost() + 0.80;
    }
}
