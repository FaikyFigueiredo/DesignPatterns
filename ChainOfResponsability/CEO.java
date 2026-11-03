package ChainOfResponsability;
public class CEO implements Chain{
    
    @Override
    public void setNext(Chain next) {}
    @Override
    public void process(float value) {
        System.out.println("Success!! Bought by CEO");
    }
}
