package Singleton;
public class Settings {
    private static Settings s;
    int width, height, scale;
    public static synchronized Settings getSettings(){
        if(s == null)
            s = new Settings();
        return s;
    }
    private Settings(){
        width = 10;
        height = 5;
        scale = 1;
    }
}
