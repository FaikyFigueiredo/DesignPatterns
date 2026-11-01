package Facade;
public class Light {
    int luminosity;

    public Light(){
        luminosity = 100;
    }

    public void setIntensityCinema(){
        luminosity = 20;
    }
    public void setIntensityNormal(){
        luminosity = 100;
    }
}
