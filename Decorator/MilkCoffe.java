package Decorator;
public class MilkCoffe implements Coffe{
    
    private Coffe decorator;

    public MilkCoffe(Coffe coffe){
        decorator = coffe;
    }
    
    @Override
    public double cost() {
        return decorator.cost() + 2.0;
    }
    @Override
    public String getDescription() {
        return decorator.getDescription() + "With Milk";
    }
}
