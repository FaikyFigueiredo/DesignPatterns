package Memento;
import java.util.ArrayList;

public class History {
    static History history;
    ArrayList<TextMemento> texts;

    private History(){
        texts = new ArrayList<>();
    }
    public static History getHistory(){
        if (history == null)
            history = new History();
        return history;
    }
    public void push(String content){
        texts.add(new TextMemento(content));
    }
    public Memento get(){
        if(texts.size() == 0)
            return null;
        TextMemento temp = texts.get(texts.size() - 1);
        texts.remove(temp);
        return temp;
    }
}
