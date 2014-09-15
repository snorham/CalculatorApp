package calculatorapp;
import java.lang.Math;
import java.util.Scanner;

/**
 * Created by Borham on 9/14/14.
 */
public class CalculatorApp {
    double num1;
    double num2;

    //creating a lot of useless methods here... just trying to get in the habit of making methods for things

    double addition(double add1, double add2){
        return (add1 + add2);
    }

    double subtraction(double sub1, double sub2){
        return (sub1 - sub2);
    }

    double multiplication(double multiply1, double multiply2){
        return (multiply1 * multiply2);
    }

    double division(double numerator, double denominator){
        return (numerator / denominator);
    }

    //ok this one is really useless.... but yeah... same thing as before

    double squareRoot(double number){
        return (Math.sqrt(number));
    }



    public static void main(String[] args) {

        int choice;
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
                    valid = true;
                }

                else {
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

        }while(valid);
    }





}
