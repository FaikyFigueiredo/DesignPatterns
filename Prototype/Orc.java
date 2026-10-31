package Prototype;
public class Orc extends Enemy{

    public Orc(int x, int y){
        super(100, 10, "OrcImage", "OrcSound");
        this.x = x;
        this.y = y;
    }

    @Override
    public void attack() {
        System.out.println("Orc attacking");
    }

    @Override
    public void takeDamage() {
        life -= 2;
        System.out.println("Orc taked damage");
    }

    @Override
    public void jump() {
        y += 3;
        System.out.println("Orc jumping");
    }
}
