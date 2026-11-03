package ChainOfResponsability;
public class Director implements Chain{
    Chain next;
    
    @Override
    public void setNext(Chain next) {
        this.next = next;
    }
    @Override
    public void process(float value) {
        if(value > 5000){
            if(next != null) next.process(value);
            else System.out.println("Fail to purchase: limit is less than the value");
        }else System.out.println("Success!! Bought by Director");
    }
}