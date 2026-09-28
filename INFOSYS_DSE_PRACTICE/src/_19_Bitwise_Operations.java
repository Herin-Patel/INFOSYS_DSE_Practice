import java.util.Scanner;

public class _19_Bitwise_Operations {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate Bitwise operations.");
        System.out.println();
        System.out.println();


        try {
            Input_Handler.displayLines();
            System.out.println("Please enter any two numbers to perform bitwise operations as follows :-");

            System.out.println("Please enter the first number :-");
            int firstNum = Input_Handler.getInput("Enter first number = ");

            System.out.println("Now, please enter the second number :-");
            int secondNum = Input_Handler.getInput("Enter second number = ");

            System.out.println("Thus, the two numbers entered by user are :-");
            System.out.printf("First number = %d\n", firstNum);
            System.out.printf("Second number = %d\n", secondNum);

            int choice = 0;
            do {
                System.out.println();
                displayMainDashboard();

                System.out.println();
                choice = Input_Handler.getInput("Your choice = ");

                switch (choice) {
                    case 1:
                        System.out.println("The user has opted to perform BITWISE AND Operation.");
                        bitwiseAndOperation(firstNum, secondNum);
                        break;

                    case 2:
                        System.out.println("The user has opted to perform BITWISE OR Operation.");
                        bitwiseOrOperation(firstNum, secondNum);
                        break;

                    case 3:
                        System.out.println("The user has opted to perform BITWISE XOR Operation.");
                        bitwiseXorOperation(firstNum, secondNum);
                        break;

                    case 4:
                        System.out.println("The user has opted to perform BITWISE COMPLIMENT Operation.");
                        bitwiseComplimentOperation(firstNum, secondNum);
                        break;

                    case 5:
                        System.out.println("The user has opted to perform Left-shift operation.");
                        leftShiftOperation(firstNum, secondNum);
                        break;

                    case 6:
                        System.out.println("The user has opted to perform Right-shift operation.");
                        rightShiftOperation(firstNum, secondNum);
                        break;

                    case 7:
                        System.out.println("The user has opted to quit from the program.");
                        break;

                    default:
                        System.out.println("Please enter a valid choice between 1 and 7.");
                        break;
                }
            } while (choice != 7);

        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        Input_Handler.displayLines();
    }

    public static void displayMainDashboard() {
        Input_Handler.displayLines();
        System.out.println("------ Dashboard ------");
        System.out.println("1. Perform Bitwise AND Operaiton.");
        System.out.println("2. Perform Bitwise OR Operation.");
        System.out.println("3. Perform Bitwise XOR Operation.");
        System.out.println("4. Perform Bitwise Compliment Operation.");
        System.out.println("5. Perform Left-shift operation.");
        System.out.println("6. Perform Right-shift operation.");
        System.out.println("7. Exit.");
        Input_Handler.displayLines();
    }

    public static void bitwiseAndOperation(int firstNum, int secondNum) {
        System.out.printf("%d & %d = %d\n", firstNum, secondNum, (firstNum & secondNum));
    }

    public static void bitwiseOrOperation(int firstNum, int secondNum) {
        System.out.printf("%d | %d = %d\n", firstNum, secondNum, (firstNum | secondNum));
    }

    public static void bitwiseXorOperation(int firstNum, int secondNum) {
        System.out.printf("%d ^ %d = %d\n", firstNum, secondNum, (firstNum ^ secondNum));
    }

    public static void bitwiseComplimentOperation(int firstNum, int secondNum) {
        System.out.printf("Compliment of %d = %d\n", firstNum, (~firstNum));
        System.out.printf("Compliment of %d = %d\n", secondNum, (~secondNum));
    }

    public static void leftShiftOperation(int firstNum, int secondNum) {
        System.out.printf("Left-shift of %d = %d\n", firstNum, firstNum << 1);
        System.out.printf("Left-shift of %d = %d\n", secondNum, secondNum << 1);
    }

    public static void rightShiftOperation(int firstNum, int secondNum) {
        System.out.printf("Right-shift of %d = %d\n", firstNum, firstNum >> 1);
        System.out.printf("Right-shift of %d = %d\n", secondNum, secondNum >> 1);
    }

}
