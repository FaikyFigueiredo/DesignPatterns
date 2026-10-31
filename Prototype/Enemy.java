package Prototype;
public abstract class Enemy implements Cloneable{
    int x, y, life, damage;
    String image, sound;

    public Enemy(int life, int damage, String image, String sound){
        this.life = life;
        this.damage = damage;
        this.image = image;
        this.sound = sound;
    }

    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void render(){
        System.out.println("Rendering enemy in position: " + x + ", " + y);
    }
    public Enemy clone(){
        try{
            return (Enemy)super.clone();
        }catch(CloneNotSupportedException e){
            return null;
        }
    }
    public abstract void attack();
    public abstract void takeDamage();
    public abstract void jump();
}
