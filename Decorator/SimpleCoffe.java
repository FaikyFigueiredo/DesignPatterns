package Decorator;
public class SimpleCoffe implements Coffe{
    @Override
    public double cost() {
        return 10.0;
    }
    
    @Override
    public String getDescription() {
        return "Simple Coffe Drink";
    }
}