
package Subject;

import Observer.Observer;


public interface Subject {
    
    void registerObserver (Observer obj);
    void removeObserver(Observer obj);
    void notifyObservers();
    
}