package pl.sjmprofil.decorator.coffeShop;

public abstract class CoffeeDrink {

    protected String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
