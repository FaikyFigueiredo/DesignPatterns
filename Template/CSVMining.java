package Template;
public class CSVMining extends DataMining{

    @Override
    protected void open(String path) {
        System.out.println("Opening CSV file " + path);
    }

    @Override
    protected void extract(String path) {
        System.out.println("Extracting CSV file " + path);
    }

    @Override
    protected void parse(String path) {
        System.out.println("Parsing CSV file " + path);
    }
    
}
