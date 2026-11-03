package Visitor;
public class Eletronic implements Product{
    
    String name;
    
    public String getName(){
        return name;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
