public class _Pending_3_Decimal_To_Binary {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate conversion from Decimal to Binary.");
        System.out.println();
        System.out.println();

        try {
            Input_Handler.displayLines();
            System.out.println("Please enter a decimal number :-");

            int number = Input_Handler.getInput("Enter number = ");

            if (number <= 0) {
                System.out.println("The number cannot be a negative number.");
                return;
            }

            int binaryArrySize = checkBinaryArrySize(number);
            int[] binaryArry = new int[binaryArrySize];

            fillBinaryArry(number, binaryArry);

            System.out.println("Thus, the binary number for given decimal number is given as follows :-");
            System.out.printf("Decimal = %d\n", number);
            System.out.printf("Binary = ");
            for (int i = binaryArry.length - 1; i >= 0; i--) {
                System.out.printf("%d", binaryArry[i]);
            }
        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        Input_Handler.displayLines();
    }

    public static int checkBinaryArrySize(int number) {
        int iterationSize = 0;

        while (number != 0) {
            iterationSize++;
            number = number / 2;
        }

        return iterationSize;
    }

    public static void fillBinaryArry(int number, int[] binaryArry) {
        int remainder = 0, arryIndex = 0;

        while (number != 0) {
            remainder = number % 2;
            binaryArry[arryIndex] = remainder;
            arryIndex++;
            number = number / 2;
        }
    }
}
