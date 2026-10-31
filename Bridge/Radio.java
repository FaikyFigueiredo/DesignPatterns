package Bridge;
public class Radio extends CommunicationDevice{

    String station;

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
    
    public void changeStation(String station){
        this.station = station;
    }

    @Override
    public void changeFont(String font) {
        changeStation(font);
    }
}
