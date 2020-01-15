package udemy.observer.models;

import udemy.observer.interfaces.Observer;
import udemy.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String message;



    @Override
    public void register(Observer observer) {
        if(observer == null)
            throw new NullPointerException("Null Object/Observer");

        if(!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        if(!observers.isEmpty())
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:this.observers) {
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String message) {
        System.out.println("Message posted to subscribers: " + message);
        this.message = message;
        notifyObservers();
    }
}
