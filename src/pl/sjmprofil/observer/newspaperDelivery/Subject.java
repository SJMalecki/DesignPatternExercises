package pl.sjmprofil.observer.newspaperDelivery;

public interface Subject {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void deliverNewspaper();
}
