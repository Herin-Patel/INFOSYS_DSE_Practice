public class _28_Sum_Of_Digits {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate sum of digits of a number.");
        System.out.println();
        System.out.println();

        Input_Handler.displayLines();
        System.out.println("Please enter a number whose sum of digits you want :-");
        try {
            int number = Input_Handler.getInput("Enter number = ");

            if (number < 0) {
                System.out.println("Number cannot be a negative number !");
                return;
            }

            calculateSum(number);
        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        Input_Handler.displayLines();
    }

    public static void calculateSum(int number) {
        int sum = 0, tempNumber = number;

        while (tempNumber > 0) {
            try {
                int rem = tempNumber % 10;
                sum = Math.addExact(sum, rem);
                tempNumber = Math.divideExact(tempNumber, 10);
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Number cannot be calculated due to data over-flow.");
                return;
            }
        }

        System.out.println();
        System.out.println("Thus, sum of digits of the number is given as :-");
        System.out.printf("Number = %d\n", number);
        System.out.printf("Sum = %d\n", sum);
    }
}
