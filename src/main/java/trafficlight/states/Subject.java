package trafficlight.states;

import trafficlight.gui.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    // Methods Attach, Detach and Notify
    List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        for(Observer observer : observers) {
            observer.update();
        }
    }
}
