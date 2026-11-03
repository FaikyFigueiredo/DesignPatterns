package Visitor;
public class Describer implements Visitor{

    @Override
    public void visit(Book book) {
        System.out.println("You bought a book called " + book.getTitle() + " from " + book.getAuthor());
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("You bought a fruit called " + fruit.getName());
    }

    @Override
    public void visit(Eletronic eletronic) {
        System.out.println("You bought a eletronic called " + eletronic.getName());
    }
}
