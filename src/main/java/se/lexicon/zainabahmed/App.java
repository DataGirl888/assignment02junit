package se.lexicon.zainabahmed;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;


/**
 WEEK ONE
 CALCULATOR ASSIGNMENT
 Menu driven console based basic arithmetic calculator
 Addition, subtraction, multiplication and division.
 Runs until user chooses to exit
 Addition and subtraction handle any number of parameters
 Each mathematical operation has it's own method
 Loops and switch case menu based interface

 */
public class App
{
    public static Scanner scanner = new Scanner(System.in);

    public static void main( String[] args )
    {

        System.out.println( "Welcome to the Calculator!" );
        String stopRunning = "n";
        while (stopRunning.equalsIgnoreCase("n"))    //N,n for 'no, continue', Y,y for 'yes, exit'.
        {
            System.out.println( "Which operation would you like to perform?" );
            System.out.println( "(Press 'a' for addition,  's' for subtraction,  'm' for multiplication,  'd' for division.)" );

            //USER MENU TO CHOOS MATHEMATICAL OPERATIONS

            char menuOperator = scanner.next().charAt(0);   // taking only the first char of input
            switch(menuOperator)
            {
                case 'A':
                case 'a':
                case '+':
                    operationAdd();
                    //System.out.println("The total sum is " + operationAdd());
                    break;
                case 'M':
                case 'm':
                case '*':
                    operationMultiply();
                    //System.out.println("The product is "  + operationMultiply());
                    break;
                case 'D':
                case 'd':
                case '/':
                    operationDivide();
                    //System.out.println("The quotient ");
                    break;
                case 'S':
                case 's':
                case '-':
                    operationSubtract();
                    //System.out.println("The final difference is " + operationSubtract());
                    break;
                default:
                    System.out.println("Error: only +, *, /, - are supported. ");
            }


            //USER OPTION TO EXIT
            stopRunning = askIfExit();  //take user input to exit or continue. N for 'no, continue', Y for 'yes, exit'.
            //System.out.print("stopRunning = " + stopRunning); // testing my code
        }
    }
    public static int getUserIntegerInput()    // method to get integer input from user
    {
        //scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.print("Please enter a whole number: ");
        String userInput = scanner.nextLine();
        return Integer.valueOf(userInput);
    }
    public static double getUserDoubleInput()    // method to get decimal input from user
    {
        //scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.print("Please enter a decimal number: ");
        String userInput = scanner.nextLine();
        double userDecimal = Double.parseDouble(userInput);
        return userDecimal;
    }
    public static void operationAdd()
    {
        scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.println("Addition. (press 0 to calculate, when all the terms have been entered) ");
        int userAdditionInput = 1, sumTotal =0;

        while (userAdditionInput!=0)
        {
            userAdditionInput = getUserIntegerInput();
            sumTotal = sumTotal + userAdditionInput;
            //System.out.println("user input " + userAdditionInput + ". Total " + sumTotal); // testing my code
        }
        System.out.println("The total sum is " + sumTotal);
        //return sumTotal;

    }
    public static void operationSubtract()  // void method, not returning value, printing result in value
    {
        scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.println("Subtraction. (press 0 to calculate, when all the terms have been entered) ");
        int userSubtractionInput = 1, finalDifference =getUserIntegerInput();   // first term (minuend) entered is saved to final result

        while (userSubtractionInput!=0)
        {
            userSubtractionInput = getUserIntegerInput();   // second and subsequent terms (subtrahend) subtracted from result
            finalDifference = finalDifference - userSubtractionInput;
            //System.out.println("user input " + userSubtractionInput + ". Difference " + finalDifference); // testing my code
        }
        System.out.println("The final difference is " + finalDifference);
        //return finalDifference;
    }
    public static void operationMultiply() // void method, printing result from within method
    {
        scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.println("Multiplication. ");
        double firstFactor = getUserDoubleInput();
        double secondFactor = getUserDoubleInput();
        double rawProduct, finalProduct;

        rawProduct = firstFactor * secondFactor;
        finalProduct = Math.round(rawProduct);
        //System.out.println("user input " + firstFactor + "input2 " + secondFactor +". Prod " + finalProduct + "round " + Math.round(finalProduct)); // testing my code

        System.out.println("The product (rounded to the nearest whole number) is "+ finalProduct);
        //return finalProduct;
    }

    public static void operationDivide()
    {
        scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.println("Division. ");
        double firstDividend = getUserDoubleInput();
        double secondDivisor = getUserDoubleInput();
        double finalQuotient;

        finalQuotient = firstDividend / secondDivisor;  // not rounding this, as in multiplication, was not mentioned as requirement
        System.out.println("The quotient is " + finalQuotient );
    }
    public static String askIfExit()
    {
        String exitVariable = "b";
        scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.println("Do you want to exit? (Y to exit, N to continue)");
        exitVariable = scanner.nextLine();
        return exitVariable.toLowerCase();
        /*if (exitVariable.equalsIgnoreCase("y"))
        {
            break;
        }
        else
        {
          continue;
        }*/
    }



}
