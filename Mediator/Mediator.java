package Mediator;
public interface Mediator {
    public void sendMessage(String message, User sender);
    public void add(User user);
    public void remove(User user);
}
