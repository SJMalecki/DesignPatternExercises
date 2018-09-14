package pl.sjmprofil.decorator.coffeShop;

import pl.sjmprofil.decorator.coffeShop.decorations.Milk;
import pl.sjmprofil.decorator.coffeShop.decorations.WhippedCream;

public class Demo {
    public static void main(String[] args) {

        /**
         * Creating example order: Iced Coffee with whipped cream component and milk
         */
        IcedCoffee icedCoffee = new IcedCoffee();
        WhippedCream whippedCream = new WhippedCream(icedCoffee);
        Milk milk = new Milk(whippedCream);

        /**
         * Printing out cost and description of ordered coffee
         */
        System.out.println(milk.cost() + "$");
        System.out.println(milk.getDescription());
    }
}
