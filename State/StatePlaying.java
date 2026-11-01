package State;
public class StatePlaying implements ButtonState{
    @Override
    public ButtonState pressPlay() {
        return new StatePaused();
    }
}
