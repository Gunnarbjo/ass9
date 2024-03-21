package is.hi.hbv202g.ass9.compositeObservedTemplateMethod;

import java.util.List;
import java.util.ArrayList;

public abstract class Observable {
    private List<Observer> observers;
    
    public void attach(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public Observable() {
        observers = new ArrayList<Observer>();
    }
}

