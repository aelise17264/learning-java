package OOP;

public class Main {
    public static void main(String[] args){
       System.out.println(Tree.TRUNK_COLOR);
       Tree oakTree1 = new Tree(125, 12, TreeType.OAK);

       System.out.println(oakTree1.treeType);
       oakTree1.announceTallTree();

       Tree mapleTree1 = new Tree(90, 30, TreeType.MAPLE);
        mapleTree1.announceTallTree();
   
        Tree.announceTree();
    }
}
