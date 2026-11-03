package Proxy;
import java.util.Scanner;

public class ProxyDocument implements Document{
    Document rd;
    
    public ProxyDocument(Document rd){
        this.rd = rd;
    }

    @Override
    public void display() {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you have authorization to see this file?(Y/N)");
        if (in.next().toUpperCase().equals("Y"))
            rd.display();
        in.close();
    }
}
