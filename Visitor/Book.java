package Visitor;
public class Book implements Product{
    String title, author;

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
