package ChainOfResponsability;
public interface Chain {
    public void setNext(Chain next);
    public void process(float value);
}
