package pl.sjmprofil.decorator.coffeShop;

public class FlatWhite extends CoffeeDrink {

    public FlatWhite(){
        description = "Flat White";
    }

    @Override
    public double cost() {
        return 3.75;
    }
}
