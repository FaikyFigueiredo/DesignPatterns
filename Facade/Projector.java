package Facade;
public class Projector {
    boolean isOn;

    public Projector(){
        isOn = false;
    }

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
}
