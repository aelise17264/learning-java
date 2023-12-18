package OOP;
import java.util.Scanner;

public class Employee {
    String employeeName;
    int employeeAge;
    double employeeSalary;
    String employeeLocation;

    Employee(String employeeName,
    int employeeAge,
    double employeeSalary,
    String employeeLocation){
        this.employeeName = employeeName;
        this.employeeAge = employeeAge;
        this.employeeSalary = employeeSalary;
        this.employeeLocation = employeeLocation;
    }

    void raiseSalary(){
        System.out.println("Has " + this.employeeName + " been going above & beyond expectations? Y/N");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        if(userInput.equals("Y")){
            this.employeeSalary = this.employeeSalary + (this.employeeSalary * .10);
            // System.out.println("Their new salary: " + this.employeeSalary);
        }
    }
}
