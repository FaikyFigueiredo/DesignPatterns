package Factory;
public class Report implements Document{
    @Override
    public void open() {
        System.out.println("Opening report");
    }
}
