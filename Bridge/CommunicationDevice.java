package Bridge;
public abstract class CommunicationDevice {
    boolean on;
    int volume;

    public abstract boolean isOn();
    public abstract int getVolume();
    public abstract void setVolume(int volume);
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void changeFont(String font);
}
