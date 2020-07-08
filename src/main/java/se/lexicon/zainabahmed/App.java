package se.lexicon.zainabahmed;
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;
//import java.util.Random;

/**
 WEEK TWO ASSIGNMENT: ARRAYS AND JUNIT
 Junit tested the division method for dividing with Zero (No exception crash allowed)
 Each mathematical operation testable by Junit.
 -Overloaded methods for Addition & Subtraction that accepts an array
 as input parameter.
 CALCULATOR
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

        System.out.println( "Welcome to the Calculator! (press 'x' to exit)" );
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
                    System.out.println("How many numbers (terms) do you want to add? (If unsure, enter 0.)");
                    scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
                    int userAdditionChoice = getUserIntegerInput();
                    if (userAdditionChoice ==0)  // if number of terms not defined, we call the addition method
                    {
                        operationAdd();
                    }
                    else  // overloaded version of addition method taking array input called if number of terms defined
                    {
                        System.out.println("The total sum is " + operationAdd(getUserArrayInput(userAdditionChoice)));
                    }
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
                    System.out.println("How many numbers (terms) do you want to subtract? (If unsure, enter 0.)");
                    scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
                    int userSubtractionChoice = getUserIntegerInput();
                    if (userSubtractionChoice ==0)  // if number of terms not defined, we call the subtraction method
                    {
                        operationSubtract();
                    }
                    else  // overloaded version of subtraction method taking array input called if number of terms defined
                    {
                        System.out.println("The total difference is " + operationSubtract(getUserArrayInput(userSubtractionChoice)));
                    }
                    break;
                case 'X':
                case 'x':
                    stopRunning = askIfExit();
                    //stopRunning = "y";
                    break;
                default:
                    System.out.println("Error: only +, *, /, - are supported. ");
            }
            //USER OPTION TO EXIT
            //stopRunning = askIfExit();  //take user input to exit or continue. N for 'no, continue', Y for 'yes, exit'.
            //System.out.print("stopRunning = " + stopRunning); // testing my code
        }
    }
    public static int getUserIntegerInput()    // method to get integer input from user
    {
        //scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.print("Please enter a whole number: ");
        String userInput = scanner.nextLine();
        return Integer.parseInt(userInput);
    }
    public static double getUserDoubleInput()    // method to get decimal input from user
    {
        //scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.print("Please enter a decimal number: ");
        String userInput = scanner.nextLine();
        double userDecimal = Double.parseDouble(userInput);
        return userDecimal;
    }
    public static int[] getUserArrayInput(int sizeOfArray)    // method to save user input to array
    {
        int[] myArraySize = new int[sizeOfArray];  // create the array of user defined size
        System.out.println("Enter " + sizeOfArray + " numbers: ");
        for (int i = 0; i<sizeOfArray; i++)
        {
        System.out.println("Enter number " + (int)(i+1) );
        myArraySize[i] = Integer.parseInt(scanner.nextLine());
        }
        return myArraySize;
    }
    public static void operationAdd()
    {
        //scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
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
    //OVERLOADED addition method to accept array input
    public static int operationAdd(int[] inputArray)
    {
        System.out.println("Addition of " + inputArray.length + " numbers.");
        int sumTotal =0;
        for (int element : inputArray)
        {
            sumTotal += element;
        }
        return sumTotal;
    }
    public static void operationSubtract()  // void method, not returning value, printing result in value
    {
        //scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
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
    //OVERLOADED subtraction method to accept array input
    public static int operationSubtract(int[] inputArray)
    {
    int finalDifference = inputArray[0]; //, counter = 0;
    //System.out.println("finalDifference " + finalDifference + " inputArray[0] " + inputArray[0] ); //testing my code
    for (int i =1; i < inputArray.length; i++)
        {
        finalDifference -= inputArray[i];
        //System.out.println("finalDifference " +finalDifference + " current  " +inputArray[i] + " array " + inputArray[counter] ); //testing my code
        //counter++;
        }
    return finalDifference;
    }
    public static void operationMultiply() // void method, printing result from within method
    {
        scanner.nextLine(); // clearing any \n errors that causes it to exit without taking input
        System.out.println("Multiplication of two numbers. ");
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
