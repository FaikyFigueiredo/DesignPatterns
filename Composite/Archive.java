package Composite;
public class Archive implements File{
    @Override
    public void open() {
        System.out.println("Executing archive");
    }
    @Override
    public void delete() {
        Navegator.getFiles().remove(this);
    }
}
