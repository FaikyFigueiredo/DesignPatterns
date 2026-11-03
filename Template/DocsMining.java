package Template;
public class DocsMining extends DataMining{

    @Override
    protected void open(String path) {
        System.out.println("Opening Docs file " + path);
    }

    @Override
    protected void extract(String path) {
        System.out.println("Extracting Docs file " + path);
    }

    @Override
    protected void parse(String path) {
        System.out.println("Parsing Docs file " + path);
    }
    
}
