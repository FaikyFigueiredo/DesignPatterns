package Composite;
import java.util.ArrayList;

public class Navegator{
    private static ArrayList<File> actualFiles;

    public static void navegate(ArrayList<File> files){
        actualFiles = files;
        //Menu to navegate...
    }
    public static ArrayList<File> getFiles(){
        return actualFiles;
    }
}
