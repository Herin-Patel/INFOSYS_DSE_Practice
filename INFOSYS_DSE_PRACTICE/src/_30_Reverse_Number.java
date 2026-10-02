public class _30_Reverse_Number {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate reversing of a number.");
        System.out.println();
        System.out.println();

        Input_Handler.displayLines();
        System.out.println("Please enter a number whose reverse number you want :-");
        try {
            int number = Input_Handler.getInput("Enter number = ");

            if (number < 0) {
                System.out.println("Please enter a positive number.");
                return;
            } else if (number == 0) {
                System.out.println("Number = 0");
                System.out.println("Reversed number = 0");
                return;
            }

            reverseNumber(number);
        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        Input_Handler.displayLines();
    }

    public static void reverseNumber(int number) {
        int reverseNumber = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            try {
                int rem = tempNumber % 10;
                reverseNumber = Math.addExact(Math.multiplyExact(reverseNumber, 10), rem);
                tempNumber = Math.divideExact(tempNumber, 10);
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Number cannot be calculated due to data-overflow.");
                return;
            }
        }

        if (reverseNumber != 0) {
            System.out.println("Thus, the reversed number is calculated as follows :-");
            System.out.printf("Number = %d\n", number);
            System.out.printf("Reversed number = %d\n", reverseNumber);
        }
    }
}
