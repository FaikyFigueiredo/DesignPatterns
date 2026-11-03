package Command;
public class LightCommander implements Command{
    
    Light light;

    public LightCommander(Light l){
        light = l;
    }
    
    @Override
    public void execute() {
        light.toggle();
    }
}
