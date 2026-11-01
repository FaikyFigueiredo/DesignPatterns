package Flyweight;
public class Tree {
    int x,y;
    float size;
    TreeFlyweight intrinsic;

    public Tree(int x, int y, float size){
        this.x = x;
        this.y = y;
        this.size = size;
        intrinsic = TreeFlyweight.getTreeIntrinsic();
    }
}
