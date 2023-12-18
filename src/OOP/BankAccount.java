package OOP;
import java.util.Scanner;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance){
        this.owner = owner;
        this.balance = balance;
    }

    public double withdraw(){
        System.out.println("How much would you like to withdraw from your account?");
        Scanner scanner = new Scanner(System.in);
        double userWithdraw = scanner.nextDouble();
        this.balance = this.balance - userWithdraw;

        if(userWithdraw > this.balance){
            System.out.println("You've overdrafted your account");
        }else{
            System.out.println(this.owner + "'s current account balance is " + this.balance);
        }
        return this.balance;
    }

    public double deposit(){
        System.out.println("How much would you like to deposit to your account?");
        Scanner scanner = new Scanner(System.in);
        double userDeposit = scanner.nextDouble();
        this.balance = this.balance + userDeposit;

        System.out.println(this.owner + "'s current account balance is " + this.balance);
        
        return this.balance;


    }

    public double getBalance(){
        return balance;
    }
    
    public String getOwner(){
        return owner;
    }
    
}
