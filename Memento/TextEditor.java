package Memento;
public class TextEditor{
    
    String content;
    History stack;
    
    public TextEditor(){
        stack = History.getHistory();
    }

    public void doMemento(){
        stack.push(content);
    }
    public void undoMemento(){
        Memento temp = stack.get();
        if(temp == null) return;
        content = temp.getData();
    }
}