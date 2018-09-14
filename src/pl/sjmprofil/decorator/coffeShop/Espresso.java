package pl.sjmprofil.decorator.coffeShop;

public class Espresso extends CoffeeDrink{

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.50;
    }
}
