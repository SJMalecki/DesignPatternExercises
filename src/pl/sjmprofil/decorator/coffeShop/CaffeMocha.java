package pl.sjmprofil.decorator.coffeShop;

public class CaffeMocha extends CoffeeDrink {

    public CaffeMocha(){
        description = "Caffe Mocha";
    }

    @Override
    public double cost() {
        return 3.45;
    }
}
