
package Subject;
import java.util.ArrayList;
import java.util.List;
import Observer.Observer;

public class Events implements Subject{
    
    private final List <Observer> observers;
    private float saturacion;
    private String atencion;
    private float solicitud;
    
    public Events(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver (Observer obj){
        observers.add(obj);
    }    
    
    @Override
    public void removeObserver (Observer obj){
        observers.add(obj);
    } 
    
    public void notifyObservers (){
        for (Observer observer : observers){
            observer.update(saturacion, atencion, solicitud);
        }
    } 
    
    public void measurementsChanged(){
        notifyObservers();
    }
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.saturacion = temperature;
        this.atencion = humidity;
        this.solicitud = pressure;
        measurementsChanged();
    }
    
    public float getTemperature(){
        return saturacion;
    }
    
    public float getHumidity(){
        return atencion;
    }
    
    public float getPressure(){
        return solicitud;
    } 

    
}