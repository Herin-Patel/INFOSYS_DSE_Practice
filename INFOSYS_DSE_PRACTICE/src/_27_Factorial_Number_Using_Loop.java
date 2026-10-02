public class _27_Factorial_Number_Using_Loop {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate factorial of a given number.");
        System.out.println();
        System.out.println();

        try {
            Input_Handler.displayLines();
            System.out.println("Please enter a number whose factorial you want to calculate :-");
            int number = Input_Handler.getInput("Enter the number = ");

            if (number < 0) {
                System.out.println("Factorial of a negative number cannot be calculated !");
                return;
            }

            int result = calculateFactorial(number);
            if (result == 0)
                System.out.println("Error in calculating factorial.");
            else
                System.out.printf("Factorial of %d = %d\n", number, result);
            Input_Handler.displayLines();
        } finally {
            Input_Handler.closeScanner();
        }
    }

    public static int calculateFactorial(int number) {
        if (number == 0 || number == 1)
            return 1;
        else if (number == 2)
            return 2;
        else {
            int result = 1;

            for (int currentNumber = 2; currentNumber <= number; currentNumber++) {
                try {
                    result = Math.multiplyExact(currentNumber, result);
                } catch (ArithmeticException arExpObj) {
                    Input_Handler.displayExceptionMessage(arExpObj, "Number cannot be displayed because of data overflow.");
                    return 0;
                }
            }

            return result;
        }
    }
}
