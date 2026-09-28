public class _8_Check_Numbers {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate operations on a number.");
        System.out.println();
        System.out.println();

        try {
            displayLines();

            int number = 0;
            System.out.println("Please enter a number of your choice :- ");
            while (true) {
                number = Input_Handler.getInput("Enter number = ");

                if (number != 0)
                    break;
                System.out.println("Error : Number cannot be zero !");
            }

            int choice = 0;
            do {
                displayMenu();

                choice = Input_Handler.getInput("Your choice = ");

                switch (choice) {
                    case 1:
                        checkPositiveNumber(number);
                        break;

                    case 2:
                        checkNegativeNumber(number);
                        break;

                    case 3:
                        checkEvenNumber(number);
                        break;

                    case 4:
                        checkOddNumber(number);
                        break;

                    case 5:
                        System.out.println("The user has opted to quit from the program.");
                        System.out.println("Exiting from the program.");
                        break;

                    default:
                        System.out.println("Please enter a valid choice between 1 and 5.");
                        break;
                }
            } while (choice != 5);

        } finally {
            // Always close the scanner object
            Input_Handler.closeScanner();
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
        System.out.println("1. Check for positive number");
        System.out.println("2. Check for negative number");
        System.out.println("3. Check for even number");
        System.out.println("4. Check for negative number");
        System.out.println("5. Exit");

        System.out.println();
    }

    public static void displayLines() {
        for (int i = 0; i < 100; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void checkPositiveNumber(int number) {
        displayLines();
        System.out.println("The user has opted to check for positive number.");

        if (number > 0)
            System.out.printf("The given number %d is a postitive number.\n", number);
        else
            System.out.printf("The given number %d is not a positive number.\n", number);
    }

    public static void checkNegativeNumber(int number) {
        displayLines();
        System.out.println("The user has opted to check for negative number.");

        if (number < 0)
            System.out.printf("The given number %d is a negative number.\n", number);
        else
            System.out.printf("The given number %d is not a negative number.\n", number);
    }

    public static void checkEvenNumber(int number) {
        displayLines();
        System.out.println("The user has opted to check for even number.");

        if ((number % 2) == 0)
            System.out.printf("The given number %d is an even number.\n", number);
        else
            System.out.printf("The given number %d is not an even number.\n", number);
    }

    public static void checkOddNumber(int number) {
        displayLines();
        System.out.println("The user has opted to check for odd number.");

        if ((number % 2) != 0)
            System.out.printf("The given number %d is an odd number.\n", number);
        else
            System.out.printf("The given number %d is not an odd number.\n", number);
    }
}
