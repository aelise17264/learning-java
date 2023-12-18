package OOP;

public class Main {
    public static void main(String[] args){
    //    System.out.println(Tree.TRUNK_COLOR);
    //    Tree oakTree1 = new Tree(125, 12, TreeType.OAK);

    //    System.out.println(oakTree1.treeType);
    //    oakTree1.announceTallTree();

    //    Tree mapleTree1 = new Tree(90, 30, TreeType.MAPLE);
    //     mapleTree1.announceTallTree();
   
    //     Tree.announceTree();
        Employee employee1 = new Employee("First Employee", 36, 85000, "Denver");
        Employee employee2 = new Employee("Second Employee", 32, 75000, "Boulder");

        employee1.raiseSalary();
        employee2.raiseSalary();
        System.out.println("Current salary for " + employee1.employeeName + "is " + employee1.employeeSalary);        
        System.out.println("Current salary for " + employee2.employeeName + "is " + employee2.employeeSalary);

    }
}
