package Facade;
import java.util.Scanner;

public class Facade{
    static Facade facade;
    Light lightSys;
    Projector projector;
    StreamingPlayer player;
    Amplifier amp;
    
    private Facade(){
        lightSys = new Light();
        projector = new Projector();
        player = new StreamingPlayer();
        amp = new Amplifier();
    }

    public static Facade getFacade(){
        if(facade == null)
            facade = new Facade();
        return facade;
    }
    public void menu(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Welcome to your facade, here you can choose what to do:");
        System.out.println("1-Set home to Cinema Mode");
        System.out.println("2-Set home to Normal Mode");
        
        int opt = in.nextInt();

        switch(opt){
            case 1:
                lightSys.setIntensityCinema();
                projector.turnOn();
                player.turnOn();
                amp.setCinemaMode();
                break;
            case 2:
                lightSys.setIntensityNormal();
                projector.turnOff();
                player.turnOff();
                amp.setNormalMode();
                break;
            default:
                System.out.println("Invalid opt");
        }

        in.close();
    }
}