package Visitor;
public class Fruit implements Product{
    String name;

    public String getName(){
        return name;
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
