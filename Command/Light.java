package Command;
public class Light{
    boolean isOn;
    public Light(){
        isOn = false;
    }
    public void toggle(){
        if(isOn)
            System.out.println("Turning off the light");
        else System.out.println("Turning on the light");
        isOn = !isOn;
    }
}
