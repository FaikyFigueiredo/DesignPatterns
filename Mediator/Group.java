package Mediator;
import java.util.ArrayList;

public class Group implements Mediator{

    ArrayList<User> users;

    public Group(){
        users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if(user != sender)
                user.receiveMessage(message);
        }
    }

    @Override
    public void add(User user) {
        users.add(user);
    }

    @Override
    public void remove(User user) {
        users.remove(user);
    }
    
}
