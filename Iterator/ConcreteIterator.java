package Iterator;
public class ConcreteIterator implements Iterator{
    Playlist playlist;
    int index;

    public ConcreteIterator(Playlist p){
        playlist = p;
        index = 0;
    }
    
    @Override
    public Music next() throws NullPointerException{
        if(playlist.size() == 0) throw new NullPointerException();
        if(playlist.size() <= ++index) index = 0;
        return playlist.get(index);

    }
}
