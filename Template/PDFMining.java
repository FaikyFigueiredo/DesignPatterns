package Template;
public class PDFMining extends DataMining{

    @Override
    protected void open(String path) {
        System.out.println("Opening PDF " + path);
    }

    @Override
    protected void extract(String path) {
        System.out.println("Extracting PDF " + path);
    }

    @Override
    protected void parse(String path) {
        System.out.println("Parsing PDF " + path);
    }
    
}
