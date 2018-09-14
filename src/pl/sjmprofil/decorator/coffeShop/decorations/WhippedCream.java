package pl.sjmprofil.decorator.coffeShop.decorations;

import pl.sjmprofil.decorator.coffeShop.CoffeeDrink;

public class WhippedCream extends Ingredient {

    CoffeeDrink coffeeDrink;

    public WhippedCream(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getDescription() {
        return coffeeDrink.getDescription() + " with whipped cream";
    }

    @Override
    public double cost() {
        return coffeeDrink.cost() + 0.90;
    }
}
