package Command;
import java.util.ArrayList;

public class RemoteController {
    ArrayList<Button> buttons;

    public RemoteController(){
        buttons = new ArrayList<>();
    }
    public void addButton(Button b){
        buttons.add(b);
    }
    public void pressButton(int index){
        buttons.get(index).press();
    }
}
