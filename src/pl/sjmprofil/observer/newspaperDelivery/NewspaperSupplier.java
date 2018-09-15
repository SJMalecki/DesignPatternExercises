package pl.sjmprofil.observer.newspaperDelivery;

import java.util.ArrayList;

public class NewspaperSupplier implements Subject{

    ArrayList<Subscriber> subscribers = new ArrayList<>();

    String newspaper;

    public void setNewspaper(String newspaper){
        this.newspaper = newspaper;
        deliverNewspaper();
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void deliverNewspaper() {
        for (Subscriber s:subscribers) {
            s.collect(newspaper);
        }
    }

    public void print(){
        System.out.println(subscribers.toString());
    }
}
