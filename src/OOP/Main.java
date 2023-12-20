package OOP;
import java.util.Stack;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void addRandomNumber(ArrayList<Integer> list){
        int originalSize = list.size();
        Random random = new Random();
        int n = random.nextInt(1000);

        if(list instanceof ConditionArrayList){
            ConditionArrayList conditionList = (ConditionArrayList) list;
            while (!conditionList.isEligible(n)){
                n = random.nextInt(1000);
            }
        }
        list.add(n);
    }
    public static void main(String[] args){

        Predicate<Integer> isDivisibleByThree = n -> Math.abs(n) % 3 == 0;
        ConditionArrayList divisibleByThreeList = new ConditionArrayList(isDivisibleByThree);

        ConditionArrayList divisibleByThreeList2 = new ConditionArrayList(isDivisibleByThree, 1, 2, 3, 4, 5, 6, 9);
       System.out.println(divisibleByThreeList2);
        ArrayList<Integer> numsList = new ArrayList<>();
        numsList.add(1);        
        numsList.add(4);
        numsList.add(3);
        numsList.add(6);
        numsList.add(13);

        ConditionArrayList divisibleByThreeList3 = new ConditionArrayList(isDivisibleByThree, numsList);
        System.out.println(divisibleByThreeList3);
    }
}

//POLYMORPHISM
//  ConditionArrayList oddListy = new ConditionArrayList(
//             n -> Math.abs(n) % 2 == 1);
//         oddListy.add(1);
//         oddListy.add(2);
//         addRandomNumber(oddListy);
//         System.out.println(oddListy);

//         ConditionArrayList evenListy = new ConditionArrayList(
//             n -> Math.abs(n) % 2 == 0);
//         evenListy.add(1);
//         evenListy.add(2);
//         addRandomNumber(evenListy);
//         System.out.println(evenListy);
        
//         ArrayList<Integer> listy = new ArrayList<>();
//         listy.add(1);
//         listy.add(2);
//         addRandomNumber(listy);        
//         addRandomNumber(listy);

//         System.out.println(listy);
//  public static void addRandomNumber(ArrayList<Integer> list){
//         int originalSize = list.size();
//         Random random = new Random();
//         while(originalSize + 1 != list.size()){
//             int n = random.nextInt(1000);
//             list.add(n);
//         }
//     }
// OddArrayList oddListy = new OddArrayList(1, 2, 3, 4, 7, 9, -13);
//         addRandomNumber(oddListy);
//         System.out.println(oddListy);
//         System.out.println(oddListy.size());

//         ArrayList<Integer> listy = new ArrayList<>();
//         listy.add(1);        
//         listy.add(2);
//         listy.add(3);
//         listy.add(4);
//         listy.add(7);
//         listy.add(9);        
//         listy.add(-13);

//         addRandomNumber(listy);
//         System.out.println(listy);
//         System.out.println(listy.size());

       
//INHERITANCE
    
 // Stack<Character> charStack = new Stack<>();

        // charStack.push('C');        
        // charStack.push('A');
        // charStack.push('T');

        // System.out.println(charStack.pop());        
        // System.out.println(charStack.pop());
        // System.out.println(charStack.pop());

//ENCAPSULATION

    //    System.out.println(Tree.TRUNK_COLOR);
    //    Tree oakTree1 = new Tree(125, 12, TreeType.OAK);

    //    System.out.println(oakTree1.getTreeType());       
    //    System.out.println(oakTree1.getHeightFt());
    //    System.out.println(oakTree1.getTrunkDiameter());
    //    oakTree1.grow();

    //    System.out.println(oakTree1.getHeightFt());

//CLASSES & OBJECTS
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
