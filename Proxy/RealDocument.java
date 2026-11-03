package Proxy;
public class RealDocument implements Document{
    String secretData;
    
    @Override
    public void display() {
        System.out.println(secretData);
    }
}
