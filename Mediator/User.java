package Mediator;
import java.util.ArrayList;

public class User {
    String name;
    ArrayList<Group> groups;

    public void sendMessage(int index, String message){
        groups.get(index).sendMessage(message, this);
    }

    public void receiveMessage(String message){
        System.out.println(message);
    }
}
