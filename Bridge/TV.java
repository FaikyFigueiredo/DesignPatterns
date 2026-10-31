package Bridge;
public class TV extends CommunicationDevice{

    String channel;

    @Override
    public boolean isOn() {
        return on;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }
    public void changeStation(String channel){
        this.channel = channel;
    }

    @Override
    public void changeFont(String font) {
        changeStation(font);
    }
}
