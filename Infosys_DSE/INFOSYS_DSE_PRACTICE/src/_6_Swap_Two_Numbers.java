import java.util.Scanner;

public class _6_Swap_Two_Numbers {
    public static void main(String[] args) {
        System.out.println("Program to swap two numbers.");
        System.out.println();
        System.out.println();

        try {
            System.out.println("Please enter the first number as follows :-");
            int firstNum = 0;
            while (true) {
                firstNum = Input_Handler.getInput("Enter first number = ");

                if (firstNum != 0)
                    break;
                System.out.println("Error : Number cannot be zero !");
            }

            System.out.println();
            System.out.println("Now please enter the second number as follows :-");
            int secondNum = 0;
            while (true) {
                secondNum = Input_Handler.getInput("Enter the second number = ");

                if (secondNum != 0)
                    break;
                System.out.println("Error : Number cannot be zero !");
            }

            System.out.println();
            System.out.println("Thus, the two numbers entered by user are :- ");
            System.out.println("First number = " + firstNum);
            System.out.println("Second number = " + secondNum);

            System.out.println("After swapping, the numbers are given as :-");
            swapNumbers(firstNum, secondNum);

            System.out.println();
            System.out.println("End of program reached.");

        } finally {
            // Always close the scanner object after use
            Input_Handler.closeScanner();
        }
    }

    public static void swapNumbers(int firstNum, int secondNum) {
        int tempNum = firstNum;
        firstNum = secondNum;
        secondNum = tempNum;

        System.out.println("First number = " + firstNum);
        System.out.println("Second number = " + secondNum);
    }
}