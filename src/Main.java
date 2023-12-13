import java.util.Scanner;

public class Main {
    // public static void main(String[] args) {
    //     System.out.println("Hello from the Main file");
    // }

    // public static void main(String[] args){
    //    int studentAge = 15;
    //    double studentGPA = 3.45;
    //    String studentFirstName = "Kayla";
    //    char studentFirstInitial = studentFirstName.charAt(0);

    //    String studentLastName = "Hammon";
    //    char studentLastInitial = studentLastName.charAt(0);

    //    boolean hasPerfectAttendance = true;

    // //    System.out.println(studentAge);       
    // //    System.out.println(studentGPA);
    // //    System.out.println(studentFirstInitial);
    // //    System.out.println(studentLastInitial);       
    // //    System.out.println(hasPerfectAttendance);       
    // //    System.out.println(studentFirstName);
    // //    System.out.println(studentLastName);

    // System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
    // System.out.println("What do you want to update it to?");
    // Scanner input = new Scanner(System.in);
    // studentGPA = input.nextDouble();

    // System.out.println(studentFirstName + " " + studentLastName + " now has a GPA of " + studentGPA);

    

    // }
    public static void main(String[] args){
        // System.out.println("Pick a number between 1 and 10");
        // //surrouded with try statement so that scanner is closed, no resource leak
        // try (Scanner scanner = new Scanner(System.in)) {
        //     int userNum = scanner.nextInt();
        //     if(userNum < 5){
                //         System.out.println("Enjoy the good luck a friend brings you");
                //     }else{
                //         System.out.println("Your crush will bring you a zebra cake today");
                //     }
                // }
        // try (
        // Scanner input = new Scanner(System.in)) {
        //     boolean isOnRepeat = true;
        //     while(isOnRepeat){
        //         System.out.println("Playing your fav song");
        //         System.out.println("Would you like to take this song off of repeat? Yes/No");
        //         String userInput = input.next();
        //         if(userInput.equals("Yes")){
        //             isOnRepeat = false;
        //         }
        //     }
        // }
        // System.out.println("Playing new song");
        String question = "What is the national animal of Scotland?";
        String choiceA = "Highland Cow";
        String choiceB = "Unicorn";
        String choiceC = "Haggis";

        String correctAnswer = choiceB;

        System.out.println(question);
        System.out.println(choiceA + ", " + choiceB + ", or " + choiceC + "?");
        try (Scanner input = new Scanner(System.in)) {
            String userAnswer = input.nextLine();
            userAnswer = userAnswer.substring(0, 1).toUpperCase() + userAnswer.substring(1);
            // System.out.println("you guessed: " + userAnswer);
            if(userAnswer.equals(correctAnswer)){
                System.out.println("Correct! You're one smart cookie!");
            }else{
                System.out.println("Oops the correct answer was " + correctAnswer);
            }
        }

    
    }
}
