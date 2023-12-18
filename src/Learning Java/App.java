import java.text.DecimalFormat;
import java.util.*;
public class App{
    //function
    // public static void announceDevTeaTime(){
    //     System.out.println("Waiting for tea time...");
    //     System.out.println("type in a random word & press Enter to start dev tea time");
    //     //try statement to prevent resource leak
    //     try (Scanner input = new Scanner(System.in)) {
    //         input.next();
    //     }
    //     System.out.println("It's tea time!");
    // }
    public static double calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){

        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;
        // System.out.println("Your total meal price is: " + result);
        return result;
    }
   
    public static double calculateEmployeeSalary(double hoursOfWork, double hourlyRate){
        if(hoursOfWork < 0){
            return -1;
        }

        if(hourlyRate < 0){
            return -1;
        }

        double payPerWeek = hoursOfWork * hourlyRate;
        double totalGrossSalary = payPerWeek * 52;
        return totalGrossSalary;
    }

    public static void main(String[] args) {
        System.out.println("How many hours per week do you normally work?");
        Scanner inputHours = new Scanner(System.in);
        double userHours = inputHours.nextDouble();
        System.out.println("What is your rate per hour?");
        Scanner inputRate = new Scanner(System.in);
        double userRate = inputRate.nextDouble();
        double finalIncome = calculateEmployeeSalary(userHours, userRate);
        System.out.println("Your annual gross salary is: " + finalIncome);

        System.out.println("Did you take any vacation days this week? Y/N");
        Scanner sn = new Scanner(System.in);
        String userAnswer = sn.nextLine();
        if(userAnswer.equals("Y")){
            System.out.println("How many days of vacation did you take?");
            Scanner vh = new Scanner(System.in);
            double days = vh.nextDouble();
            double hours = days * 8;
            double workedHours = userHours - hours;
            double weeklyPay = workedHours * userRate;
            System.out.println("Your pay for this week is: " + weeklyPay);
            
        }else{
            System.out.println("Be sure to take some time for self care");
        }
        // System.out.println("What was the listed price of your meal?");
        // Scanner inputPrice = new Scanner(System.in);
        // double userPrice = inputPrice.nextDouble();
        // System.out.println("How much would you like to tip? .10, .15 or .20");
        // Scanner inputTip = new Scanner(System.in);
        // double userTip = inputTip.nextDouble();
        // double groupTotalMealPrice = calculateTotalMealPrice(userPrice, userTip, .08);
        // DecimalFormat df = new DecimalFormat("####0.00");
        // System.out.println("total cost " + df.format(groupTotalMealPrice));
        // double individualMealPrice = groupTotalMealPrice/5;
        // System.out.println("Each person owes " + individualMealPrice);
    // System.out.println("Hello World!");
    // announceDevTeaTime();
    }
}