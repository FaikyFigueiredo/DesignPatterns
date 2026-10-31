package Bridge;
public class AdvancedController extends Controller{
    public void volumePlus10(){
        device.setVolume(device.getVolume() + 10);
    }
    public void volumeMinus10(){
        device.setVolume(device.getVolume() - 10);
    }
}
