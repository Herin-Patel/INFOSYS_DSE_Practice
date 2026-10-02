public class _26_Factorial_Number_Using_Recursion {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate factorial of a given number.");
        System.out.println();
        System.out.println();

        try {
            Input_Handler.displayLines();
            int number = 0;
            System.out.println("Please enter a number whose factorial you want to calculate :-");
            number = Input_Handler.getInput("Enter number = ");

            if (number < 0) {
                System.out.println("Factorial of negative number is not possible.");
                return;
            }

            System.out.printf("Thus, factorial of number %d is given as :-\n", number);
            int result = calculateFactorial(number);
            if (result != 0)
                System.out.printf("%d! = %d\n", number, result);
            else
                System.out.println("Error in calculating factorial.");
            Input_Handler.displayLines();
        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        Input_Handler.displayLines();
    }

    public static int calculateFactorial(int number) {
        if (number == 1 || number == 0) {
            return 1;
        } else {
            try {
                return Math.multiplyExact(number, (calculateFactorial(number - 1)));
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Result cannot be calculated as data is too large.");
                return 0;
            }
        }
    }
}
