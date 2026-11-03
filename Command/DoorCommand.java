package Command;
public class DoorCommand implements Command{
    
    Door door;

    public DoorCommand(Door d){
        door = d;
    }

    @Override
    public void execute() {
        door.lock();
    }
}
