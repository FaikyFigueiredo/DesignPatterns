package Prototype;
import java.util.ArrayList;
import java.util.Random;

public class Spawner {
    ArrayList<Enemy> enemies;

    public Spawner(){
        enemies = new ArrayList<>();
    }

    public void spawnHorde(){
        Enemy prototype = new Orc(0, 0);
        Random r = new Random();
        for (int i = 0; i < 30; i++){
            Enemy clone = prototype.clone();
            clone.setX(r.nextInt());
            clone.setY(r.nextInt());
            enemies.add(clone);
        }
    }
}
