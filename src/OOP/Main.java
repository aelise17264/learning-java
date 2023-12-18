package OOP;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

        ModArrayList listy = new ModArrayList();
        listy.add(0);        
        listy.add(10);
        listy.add(20);
        listy.add(30);
        listy.add(40);
        listy.add(50);

        System.out.println(listy.getUsingMod(1));        
        System.out.println(listy.getUsingMod(-2));
        System.out.println(listy.getUsingMod(50));



        // Stack<Character> charStack = new Stack<>();

        // charStack.push('C');        
        // charStack.push('A');
        // charStack.push('T');

        // System.out.println(charStack.pop());        
        // System.out.println(charStack.pop());
        // System.out.println(charStack.pop());



    //    System.out.println(Tree.TRUNK_COLOR);
    //    Tree oakTree1 = new Tree(125, 12, TreeType.OAK);

    //    System.out.println(oakTree1.getTreeType());       
    //    System.out.println(oakTree1.getHeightFt());
    //    System.out.println(oakTree1.getTrunkDiameter());
    //    oakTree1.grow();

    //    System.out.println(oakTree1.getHeightFt());


    // //    oakTree1.announceTallTree();

    //    Tree mapleTree1 = new Tree(90, 30, TreeType.MAPLE);
        // mapleTree1.announceTallTree();
   
    //     Tree.announceTree();
        // Employee employee1 = new Employee("Fred Brander", 36, 85000, "Denver");
        // Employee employee2 = new Employee("Opalescent Treeshark", 32, 75000, "Boulder");

        // employee1.raiseSalary();
        // employee2.raiseSalary();
        // System.out.println("Current salary for " + employee1.employeeName + " is " + employee1.employeeSalary);        
        // System.out.println("Current salary for " + employee2.employeeName + " is " + employee2.employeeSalary);
        // BankAccount account1 = new BankAccount("Mr Smith", 50000);
        // BankAccount account2 = new BankAccount("Mrs Jones", 75000);

        // System.out.println(account1.getOwner() + " has " + account1.getBalance() + " in their bank account");
        // account1.withdraw();

        // System.out.println(account2.getOwner() + " has " + account2.getBalance() + " in their bank account");
        // account2.deposit();

    }
}
