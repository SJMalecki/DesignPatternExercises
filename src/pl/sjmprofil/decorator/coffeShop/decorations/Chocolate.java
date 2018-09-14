package pl.sjmprofil.decorator.coffeShop.decorations;

import pl.sjmprofil.decorator.coffeShop.CoffeeDrink;

public class Chocolate extends  Ingredient {

    CoffeeDrink coffeeDrink;

    public Chocolate(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getDescription() {
        return coffeeDrink.getDescription() + " with chocolate";
    }

    @Override
    public double cost() {
        return coffeeDrink.cost() + 1.25;
    }
}
