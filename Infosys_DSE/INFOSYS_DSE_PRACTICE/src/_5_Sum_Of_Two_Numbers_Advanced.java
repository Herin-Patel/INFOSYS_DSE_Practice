import java.util.Scanner;

public class _5_Sum_Of_Two_Numbers_Advanced {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate sum of two numbers.");
        System.out.println();
        System.out.println();

        try {
            System.out.println("Please enter the first number :- ");
            int firstNum = 0;
            while (true) {
                firstNum = Input_Handler.getInput("Enter first number = ");

                if (firstNum != 0)
                    break;

                System.out.println("Error : Number cannot be zero !");
                System.out.println();
            }

            System.out.println("Now please enter the second number :- ");
            int secondNum = 0;
            while (true) {
                secondNum = Input_Handler.getInput("Enter second number = ");

                if (secondNum != 0)
                    break;

                System.out.println("Error : Number cannot be zero !");
                System.out.println();
            }

            System.out.println("Thus, the two numbers entered by user are :- ");
            System.out.printf("First number = %d\n", firstNum);
            System.out.printf("Second number = %d\n", secondNum);

            System.out.println();
            System.out.printf("Sum of two numbers is = %d\n", sum(firstNum, secondNum));

        } finally {
            // Always close the scanner object
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
    }

    public static int sum(int firstNum, int secondNum) {
        return (firstNum + secondNum);
    }
}