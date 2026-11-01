package Observer;
public class Terminal implements Observer{
    @Override
    public void receiveAlert(float temperature, float humidity) {
        System.out.println("Data received:");
        System.out.println("temperature: " + temperature);
        System.out.println("humidity: " + humidity);
    }
}