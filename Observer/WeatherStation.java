package Observer;
import java.util.ArrayList;
import java.util.Random;

public class WeatherStation{
    
    private float temperature;
    private float humidity;
    private ArrayList<Observer> observers;
    private Random r;

    public WeatherStation(ArrayList<Observer> observers){
        this.observers = observers;
        r = new Random();
        readValues();
    }
    
    public void readValues(){
        temperature = r.nextFloat()*34;
        humidity = r.nextFloat()*100;
        notifyObservers();
    }

    public void notifyObservers(){
        for (Observer observer : observers) {
            observer.receiveAlert(temperature, humidity);
        }
    }
    public void addObserver(Observer toAdd){
        observers.add(toAdd);
    }
    public void removeObserver(Observer toRemove){
        observers.remove(toRemove);
    }
}