package Template;
public abstract class DataMining {
    protected abstract void open(String path);
    protected abstract void extract(String path);
    protected abstract void parse(String path);
    protected void close(String path){
        System.out.println("The file " + path + " was closed");
    }
    public void mine(String path){
        this.open(path);
        this.extract(path);
        this.parse(path);
        this.close(path);
    }
}
