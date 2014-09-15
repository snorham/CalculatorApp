package calculatorapp;
import java.lang.Math;
import java.util.Scanner;

/**
 * Created by Borham on 9/14/14.
 */
public class CalculatorApp {
    //creating a lot of methods here, most of them are useless... just trying to get in the habit of making methods for things

public static double doubleChecker(){
    Scanner doubleScan = new Scanner(System.in);
    do {
        if (doubleScan.hasNextDouble()) {
            System.out.println();
            return (doubleScan.nextDouble());
        }
        else {
            doubleScan.nextLine();
            System.out.println();
            System.out.println("[Error: Incorrect Entry]");
            System.out.print("Please enter a number value: ");
        }
    }while(true);
}

    public static double addition(double add1, double add2){
        return (add1 + add2);
    }

    public static double subtraction(double sub1, double sub2){
        return (sub1 - sub2);
    }

    public static double multiplication(double multiply1, double multiply2){
        return (multiply1 * multiply2);
    }

    public static double division(double numerator, double denominator){
        return (numerator / denominator);
    }

    //ok this next one is really useless.... but yeah... same thing as before

    public static double squareRoot(double number){
        return (Math.sqrt(number));
    }

    public static int calcMenu(){
        int choice = 0;
        boolean valid;
        Scanner scanIt = new Scanner(System.in);

        System.out.println("==SUPER CALCULATOR==");
        System.out.println();
        System.out.println("  1) Addition");
        System.out.println("  2) Subtraction)");
        System.out.println("  3) Multiplication");
        System.out.println("  4) Division");
        System.out.println("  5) Square Root");
        System.out.println();
        System.out.print("Please enter a number (1-5) to make your choice: ");

        do {
            if (scanIt.hasNextInt()) {
                choice = scanIt.nextInt();
                if ((choice > 0) && (choice < 6)) {
                    System.out.println();
                    valid = true;
                }

                else {
                    System.out.println();
                    System.out.println("[Error: Incorrect Entry]");
                    System.out.print("Please enter a number (1-5) to make your choice: ");
                    valid = false;
                }
            }

            else {
                System.out.println("[Error: Incorrect Entry]");
                System.out.print("Please enter a number (1-5) to make your choice: ");
                valid = false;
            }

            scanIt.nextLine();

        }while(!valid);
        return choice;
    }

    public static void main(String[] args) {
        double num1, num2;

        switch (calcMenu()){
            case 1:
                System.out.print("Please enter a numeric value: ");
                num1 = doubleChecker();
                System.out.print("Please enter a numeric value to add to the first value: ");
                num2 = doubleChecker();
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + addition(num1,num2));
                break;
            case 2:
                System.out.println("Please enter a numeric value: ");
                num1 = doubleChecker();
                System.out.print("Please enter a numeric value to subtract from the first value: ");
                num2 = doubleChecker();
                System.out.println("The difference of " + num1 + " and " + num2 + " is " + subtraction(num1, num2));
                break;
            case 3:
                System.out.println("Please enter a numeric value: ");
                num1 = doubleChecker();
                System.out.println("Please enter a numeric value to multiply the first value by: ");
                num2 = doubleChecker();
                System.out.println("The product of " + num1 + " and " + num2 + " is " + multiplication(num1, num2));
                break;
            case 4:
                System.out.println("Please enter a numeric value: ");
                num1 = doubleChecker();
                System.out.println("Please enter a numeric value to divide the first value by: ");
                num2 = doubleChecker();
                System.out.println("The quotient of " + num1 + " and " + num2 + " is " + division(num1, num2));
                break;
            case 5:
                System.out.println("Please enter a numeric value: ");
                num1 = doubleChecker();
                System.out.println("The square root of " + num1 + " is " + squareRoot(num1));
                break;
            default:
                System.out.println("This default should be impossible!");
                break;

        }

    }
}
