package is.hi.hbv202g.ass9.compositeObserved;

import java.util.List;

public abstract class Observable {
    private List<Observer> observers;
    
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
