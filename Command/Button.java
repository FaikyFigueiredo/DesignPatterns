package Command;
public class Button {
    Command command;
    public Button(Command c){
        command = c;
    }
    public void press(){
        command.execute();
    }
}
