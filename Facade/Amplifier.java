package Facade;
public class Amplifier {
    float volume;

    public Amplifier(){
        volume = 20.0f;
    }

    public void setNormalMode(){
        volume = 20.0f;
    }
    public void setCinemaMode(){
        volume = 40.0f;
    }
}
