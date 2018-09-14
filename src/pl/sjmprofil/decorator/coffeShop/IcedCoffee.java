package pl.sjmprofil.decorator.coffeShop;

public class IcedCoffee extends  CoffeeDrink {

    public IcedCoffee(){
        description = " Iced Coffee";
    }

    @Override
    public double cost() {
        return 2.25;
    }
}
