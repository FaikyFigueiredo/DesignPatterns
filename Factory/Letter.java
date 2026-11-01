package Factory;
public class Letter implements Document {
    @Override
    public void open() {
        System.out.println("Opening letter");
    }
}
