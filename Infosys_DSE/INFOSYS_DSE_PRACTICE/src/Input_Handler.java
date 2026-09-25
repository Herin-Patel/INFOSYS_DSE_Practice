import java.util.NoSuchElementException;
import java.util.Scanner;

public class Input_Handler {

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
    private Input_Handler() {
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

    public static void closeProgram() {
        System.out.println("Program cannot continue without an input access.");
        System.out.println("Closing the program.");
        System.exit(1);
    }

    // Static method to get integer input
    public static int getInput(String message) {
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
    public static int getInputInRange(String message, int maxValue, int minValue) {
        if (minValue > maxValue) {
            throw new IllegalArgumentException("Minimum value cannot be greater than maximum value.");
        }

        while (true) {
            int value = getInput(message);

            if (value >= minValue && value <= maxValue)
                return value;
            System.out.printf("Error : Please enter a value between %d and %d.\n", minValue, maxValue);
        }
    }

    public static void closeScanner() {
        if (scannerObj != null)
            scannerObj.close();
    }
}
