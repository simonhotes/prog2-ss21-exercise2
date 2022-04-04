package trafficlight;

import trafficlight.gui.TrafficLight;
import trafficlight.states.State;

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
        for(trafficlight.Observer observer : observers) {
            observer.update();
        }
    }
}
