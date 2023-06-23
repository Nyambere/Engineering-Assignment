import java.util.InputMismatchException;
import java.util.Scanner;

public class Fibonacci {
    private static int numberOne = 0;
    private static int numberTwo = 1;
    private static int numberThree = 0;

    private static void generateFibonacci (int maxCount) {
        if (maxCount > 0) {
            numberThree = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberThree;
            //We print out the Fibonacci Value
            printFibonacci(maxCount);
        }
    }
    static void printFibonacci(int maxValue){
            System.out.print(" "+ numberThree);
            generateFibonacci(maxValue - 1);
    }
    public static void main(String[] args){
        //We read user input from the Console
        System.out.println("Enter any Number in the console ");
        Scanner scanner = new Scanner(System.in);
        int integer;
        try {
            // We read the Integer Number and handle non Integer values in Catch Block.
            integer = scanner.nextInt();
            //We check if Integer value is a positive and handle appropriately
            int result = Integer.signum(integer);
            if (result == 1 ) {
                //printing 0 and 1
                System.out.print(numberOne+" "+numberTwo);
                generateFibonacci(integer - 1);
            } else if (result == -1) {
                System.out.print("Sorry, Only positive Integers allowed ");
            } else {
                System.out.print(numberOne);
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid Number");
        }

    }
}
