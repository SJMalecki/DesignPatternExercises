package pl.sjmprofil.decorator.coffeShop;

public class CaffeLatte extends CoffeeDrink {

    public CaffeLatte(){
        description = "Caffe Latte";
    }

    @Override
    public double cost() {
        return 2.95;
    }
}
