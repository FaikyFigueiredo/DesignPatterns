package Facade;
public class StreamingPlayer {
    boolean isOn;

    public StreamingPlayer(){
        isOn = false;
    }

    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
}