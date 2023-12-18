package OOP;
import java.awt.Color;

public class Tree {
    private double height;
    private double trunkDiameter;
    private TreeType treeType;
    protected static Color TRUNK_COLOR = new Color(102, 51, 0);

    public Tree(double height, double trunkDiameter, TreeType treeType){
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }
    public void setTrunkDiam(double trunkDiameter){
        this.trunkDiameter = trunkDiameter;
    }

    static void announceTree(){
        System.out.println("Look out for that tree!");
    }
    public double getHeightFt(){
        return height;
    }
    public double getTrunkDiameter(){
        return trunkDiameter;
    }
    public TreeType getTreeType(){
        return treeType;
    }

    public void grow(){
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    public void announceTallTree(){
        if(this.height > 100){
            System.out.println("That's a tall " + this.treeType +  " tree!");
           }
    }
}
