package Decorator;
public class SugarCoffe implements Coffe{
    Coffe decorator;

    public SugarCoffe(Coffe coffe){
        decorator = coffe;
    }
    @Override
    public double cost() {
        return 1.0 + decorator.cost();
    }
    @Override
    public String getDescription() {
        return decorator.getDescription() + "With Sugar";
    }
}
