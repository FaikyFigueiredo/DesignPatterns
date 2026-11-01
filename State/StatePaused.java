package State;
public class StatePaused implements ButtonState{

    @Override
    public ButtonState pressPlay() {
        return new StatePlaying();
    }
    
}
