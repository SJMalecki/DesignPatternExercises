package pl.sjmprofil.observer.newspaperDelivery;

public class NewspaperReceiver implements Subscriber{

    public NewspaperReceiver(Subject newspaperSupplier){
        newspaperSupplier.addSubscriber(this);
    }

    @Override
    public void collect(String newspaper) {
        System.out.println("Newspaper has been collected: " + newspaper);
    }
}
