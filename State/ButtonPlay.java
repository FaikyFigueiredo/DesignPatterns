package State;
public class ButtonPlay {
    ButtonState state;

    public ButtonPlay(){
        state = new StatePlaying();
    }

    public void pressButton(){
        state = state.pressPlay();
    }
}
