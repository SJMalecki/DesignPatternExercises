package pl.sjmprofil.decorator.coffeShop.decorations;

import pl.sjmprofil.decorator.coffeShop.CoffeeDrink;

public class SoyMilk extends Ingredient {

    CoffeeDrink coffeeDrink;

    public SoyMilk(CoffeeDrink coffeeDrink) {
        this.coffeeDrink = coffeeDrink;
    }

    @Override
    public String getDescription() {
        return coffeeDrink.getDescription() + " with soy milk";
    }

    @Override
    public double cost() {
        return coffeeDrink.cost() + 1.00;
    }
}
