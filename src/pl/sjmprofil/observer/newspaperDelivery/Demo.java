package pl.sjmprofil.observer.newspaperDelivery;

public class Demo {
    public static void main(String[] args) {
        NewspaperSupplier newspaperSupplier = new NewspaperSupplier();

        NewspaperReceiver newspaperReceiver1 = new NewspaperReceiver(newspaperSupplier);
        NewspaperReceiver newspaperReceiver2 = new NewspaperReceiver(newspaperSupplier);

        newspaperSupplier.setNewspaper("SJM News");

        newspaperSupplier.print();
    }

}
