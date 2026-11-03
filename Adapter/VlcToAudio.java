package Adapter;
public class VlcToAudio extends OldVlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playAudio(String pth) {
        this.playVlcFile(pth);
        System.out.println("O arquivo VLC ... tá tocando");
    }
}
