public class _25_Sum_Odd_Numbers {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate sum of odd numbers upto a given number.");
        System.out.println();
        System.out.println();

        try {
            int userNumber = Integer.MIN_VALUE;
            Input_Handler.displayLines();
            System.out.println("Please enter a number uptill which you want sum of odd numbers :-");
            userNumber = Input_Handler.getInput("Enter number = ");

            calculateSum(userNumber);
        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        Input_Handler.displayLines();
    }

    public static void calculateSum(int number) {
        int sum = 0;

        for (int currentNumber = 1; currentNumber <= number; currentNumber++) {
            try {
                if (currentNumber % 2 == 0)
                    continue;
                sum = Math.addExact(sum, currentNumber);
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Sum cannot be calculated because of data-overflow.");
                return;
            }
        }

        System.out.printf("Thus, the sum of odd numbers upto %d is = %d\n", number, sum);
    }
}
