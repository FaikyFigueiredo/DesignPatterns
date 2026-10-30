package Composite;
import java.util.ArrayList;

public class Folder implements File{

    ArrayList<File> files;

    @Override
    public void delete() {
        files.removeAll(files);
    }
    @Override
    public void open() {
        Navegator.navegate(files);
    }
    public void addFile(File newFile){
        files.add(newFile);
    }
}
