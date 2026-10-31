package Bridge;
public class Controller {
    CommunicationDevice device;
    public void turnOn(){
        if(device.isOn())
            device.turnOff();
        else
            device.turnOn();
    }
    public void mute(){
        device.setVolume(0);
    }
    public void changeVolume(int volume){
        device.setVolume(volume);
    }
}
