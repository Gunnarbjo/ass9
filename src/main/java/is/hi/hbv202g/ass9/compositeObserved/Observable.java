package is.hi.hbv202g.ass9.compositeObserved;

import java.util.List;
import java.util.ArrayList;

public abstract class Observable {
    private List<Observer> observers;
    
    public void notifyObservers(Observer observer) {
        observers.add(observer);
    }
    
    public void detach(Observer observer) {
        observers.remove(observer);
    }
    
    public void attach() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
    public Observable() {
        observers = new ArrayList<Observer>();
    }
}
