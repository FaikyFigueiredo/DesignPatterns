package Command;
public class Door{
    
    boolean isLocked;

    public void lock(){
        if(isLocked)
            System.out.println("Unlocking the door");
        else System.out.println("Locking the door");
        isLocked = !isLocked;
    }
}
