import java.util.NoSuchElementException;
import java.util.Scanner;

public class _7_Arithmetic_Operations {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate arithmetic operations.");
        System.out.println();
        System.out.println();

        try {

            displayLines();
            System.out.println("Please enter two numbers as follows to perform arithmetic operation on them :-");

            int firstNum = 0;
            while (true) {
                firstNum = customInput.getIntInput("Enter first number = ");

                if (firstNum != 0)
                    break;
                System.out.println("Error : Number cannot be zero !");
            }

            int secondNum = 0;
            while (true) {
                secondNum = customInput.getIntInput("Enter second number = ");

                if (secondNum != 0)
                    break;
                System.out.println("Error : Number cannot be zero !");
            }

            System.out.println();
            displayLines();
            System.out.println("Thus, the two numbers entered by user are as follows :-");
            System.out.println("First number = " + firstNum);
            System.out.println("Second number = " + secondNum);

            int choice = 0;
            do {
                displayMenu();

                choice = customInput.getIntInput("Your choice = ");

                switch (choice) {
                    case 1:
                        System.out.println("User has opted to perform addition operation.");
                        additionOperation(firstNum, secondNum);
                        break;

                    case 2:
                        System.out.println("User has opted to perform subtraction operation.");
                        subtractionOperation(firstNum, secondNum);
                        break;

                    case 3:
                        System.out.println("User has opted to perform multiplication operation.");
                        multiplicationOperation(firstNum, secondNum);
                        break;

                    case 4:
                        System.out.println("User has opted to perform division operation.");
                        divisionOperation(firstNum, secondNum);
                        break;

                    case 5:
                        System.out.println("User has opted to perform modulo operation.");
                        moduloOperation(firstNum, secondNum);
                        break;

                    case 6:
                        System.out.println();
                        System.out.println("User has opted to quit from the program.");
                        break;

                    default:
                        System.out.println("Please enter a valid choice between 1 and 6.");
                        break;
                }
            } while (choice != 6);
        } finally {
            customInput.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        displayLines();
    }

    public static void displayMenu() {
        System.out.println();
        System.out.println();

        displayLines();
        System.out.println(" -: Dashboard :- ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo");
        System.out.println("6. Exit");

        System.out.println();
    }

    public static void displayLines() {
        for (int i = 0; i < 100; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void additionOperation(int firstNum, int secondNum) {
        System.out.printf("Addition of %d and %d is given as :- \n", firstNum, secondNum);

        try {
            int sum = Math.addExact(firstNum, secondNum);
            System.out.printf("%d + %d = %d\n", firstNum, secondNum, sum);
        } catch (ArithmeticException expObj) {
            System.out.println("Exception caught while performing addition operation.");
            customInput.displayExceptionMessage(expObj, "Integer overflow occurred during addition.");
        }
    }

    public static void subtractionOperation(int firstNum, int secondNum) {
        System.out.printf("Subtraction of %d and %d is given as :- \n", firstNum, secondNum);

        try {
            int result = Math.subtractExact(firstNum, secondNum);
            System.out.printf("%d - %d = %d\n", firstNum, secondNum, result);
        } catch (ArithmeticException expObj) {
            System.out.println("Exception caught while performing subtraction operation.");
            customInput.displayExceptionMessage(expObj, "Integer overflow occurred during subtraction.");
        }

    }

    public static void multiplicationOperation(int firstNum, int secondNum) {
        System.out.printf("Multiplication of %d and %d is given as :- \n", firstNum, secondNum);

        try {
            int result = Math.multiplyExact(firstNum, secondNum);
            System.out.printf("%d x %d = %d\n", firstNum, secondNum, result);
        } catch (ArithmeticException expObj) {
            System.out.println("Exception caught while performing multiplication operation.");
            customInput.displayExceptionMessage(expObj, "Integer overflow occurred during multiplication.");
        }

    }

    public static void divisionOperation(int firstNum, int secondNum) {
        System.out.printf("Division of %d and %d is given as :- \n", firstNum, secondNum);
        System.out.printf("%d / %d = %d\n", firstNum, secondNum, (firstNum / secondNum));
    }

    public static void moduloOperation(int firstNum, int secondNum) {
        System.out.printf("Modulo of %d and %d is given as :- \n", firstNum, secondNum);
        System.out.printf("%d %% %d = %d\n", firstNum, secondNum, (firstNum % secondNum));
    }
}


class customInput {

    // Single static scanner for entire program
    private static Scanner scannerObj;

    // Use initialization block for better error handling
    static {
        // Static initializer - runs when class is loaded
        try {
            scannerObj = new Scanner(System.in);
        } catch (NullPointerException nullExpObj) {
            System.out.println("Exception caught while assigning scanner object.");
            displayExceptionMessage(nullExpObj, "System was not able to allocate memory to scanner object.");
            closeProgram();
        } catch (IllegalArgumentException illArgExpObj) {
            System.out.println("Exception caught while assigning scanner object.");
            displayExceptionMessage(illArgExpObj, "Illegal argument passed while assigning scanner object.");
            closeProgram();
        } catch (SecurityException secExpObj) {
            System.out.println("Exception caught while assigning scanner object.");
            displayExceptionMessage(secExpObj, "Security manager has denied access to allocate memory to scanner object.");
            closeProgram();
        } catch (Exception expObj) {
            System.out.println("Exception caught while assigning scanner object.");
            displayExceptionMessage(expObj, "General exception caught while assigning scanner object.");
            closeProgram();
        }
    }

    // Private constructor to prevent instantiation (object creation)
    private customInput() {
        // This ensures no one can create Input_Handler objects
        throw new UnsupportedOperationException("Cannot instantiate Input_Handler class.");
    }

    public static void displayExceptionMessage(Exception expObj, String message) {
        System.out.println();
        System.out.printf("Exception : %s\n", message);
        System.out.printf("Exception : %s\n", expObj.getClass().getSimpleName());

        if (expObj.getMessage() != null)
            System.out.printf("Exception : %s\n", expObj.getMessage());
        System.out.println();
    }

    // Static method to get integer input
    public static int getIntInput(String message) {
        // First check if the scanner was successfully initialized
        if (scannerObj == null) {
            System.out.println("Error : Input system was not initialized !");
            closeProgram();
            return -1; // Never reached, but the compiler needs it
        }

        while (true) {
            try {
                System.out.print(message);
                String input = scannerObj.nextLine().trim();

                // First check if the input given was empty
                if (input.isEmpty()) {
                    System.out.println("Error : Input cannot be empty.");
                    System.out.println();
                    continue;
                }

                // Return the input string by parsing it to int.
                return Integer.parseInt(input);
            } catch (NoSuchElementException noEleExpObj) {
                // No more input elements are present
                System.out.println("Exception caught while using scanner object.");
                displayExceptionMessage(noEleExpObj, "Exception caught while reading input.");
                closeProgram();
            } catch (IllegalStateException illExpObj) {
                // Scanner was closed unexpected
                System.out.println("Exception caught while using scanner object.");
                displayExceptionMessage(illExpObj, "Scanner object was closed unexpectedly.");
                closeProgram();
            } catch (NumberFormatException numExpObj) {
                System.out.println("Exception caught while converting user-input to integer.");
                displayExceptionMessage(numExpObj, "Cannot convert user-input to integer.");
            } catch (NullPointerException nullExpObj) {
                System.out.println("Exception caught while converting user-input to integer.");
                displayExceptionMessage(nullExpObj, "Null string passed for parsing integer.");
            } catch (Exception expObj) {
                System.out.println("Exception caught while converting user-input to integer.");
                displayExceptionMessage(expObj, "General exception caught while parsing integer.");
            }
        }
    }

    // Static method to get integer value in range with validation
    public static int getIntInputInRange(String message, int maxValue, int minValue) {
        if (minValue > maxValue)
            throw new IllegalArgumentException("Min value cannot be greater than max value.");

        while (true) {
            int value = getIntInput(message);

            if (value >= minValue && value <= maxValue)
                return value;
            System.out.printf("Error : Please enter a value between %d and %d.\n", minValue, maxValue);
        }
    }

    public static void closeProgram() {
        System.out.println("Program cannot continue without an input access.");
        System.out.println("Closing the program.");
        System.exit(1);
    }

    public static void closeScanner() {
        if (scannerObj != null)
            scannerObj.close();
    }
}