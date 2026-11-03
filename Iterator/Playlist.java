package Iterator;
import java.util.ArrayList;

public class Playlist{

    ArrayList<Music> musics;

    public Playlist(){
        musics = new ArrayList<>();
    }

    public void add(Music toAdd) {
        musics.add(toAdd);
    }

    public void remove(Music toRemove) {
        musics.remove(toRemove);
    }
    public int size(){
        return musics.size();
    }
    public Music get(int i){
        return musics.get(i);
    }
}
