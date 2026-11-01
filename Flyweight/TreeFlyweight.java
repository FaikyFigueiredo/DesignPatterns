package Flyweight;
public class TreeFlyweight {
    static TreeFlyweight treeFlyweight;
    String image, sound, texture, color;

    private TreeFlyweight(){
        image = "TreeImage";
        sound = "TreeSound";
        texture = "TreeTexture";
        color = "TreeColor";
    }

    public static TreeFlyweight getTreeIntrinsic(){
        if(treeFlyweight == null)
            treeFlyweight = new TreeFlyweight();
        return treeFlyweight;
    }
}
