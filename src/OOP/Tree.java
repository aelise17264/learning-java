package OOP;
import java.awt.Color;

public class Tree {
    double height;
    double trunkDiameter;
    TreeType treeType;
    static Color TRUNK_COLOR = new Color(102, 51, 0);

    Tree(double height, double trunkDiameter, TreeType treeType){
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    static void announceTree(){
        System.out.println("Look out for that tree!");
    }

    void grow(){
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    void announceTallTree(){
        if(this.height > 100){
            System.out.println("That's a tall " + this.treeType +  " tree!");
           }
    }
}
