package Memento;
public class TextMemento implements Memento {

    String content;

    public TextMemento(String content){
        this.content = content;
    }

    @Override
    public String getData() {
        return content;
    }
    
}
