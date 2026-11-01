package Factory;
public class FileFactory {
    public static Document create(FileEnum type){
        switch(type){
            case LETTER:
                return new Letter();
            case REPORT:
                return new Report();
            case RESUME:
                return new Resume();
            default:
                System.out.println("ERROR, Invalid Type");
                return null;
        }
    }
}
