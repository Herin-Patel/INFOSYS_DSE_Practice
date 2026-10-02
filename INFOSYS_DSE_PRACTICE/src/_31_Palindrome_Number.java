public class _31_Palindrome_Number {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate whether a given number is palindrome or not.");
        System.out.println();
        System.out.println();

        Input_Handler.displayLines();
        System.out.println("Please enter a number which you want to check for palindrome :-");
        try {
            int number = Input_Handler.getInput("Enter number = ");

            if (number < 0) {
                System.out.println("Number cannot be a negative number !");
                return;
            }

            if (checkPalindrome(number))
                System.out.printf("Number %d is a palindrome number.\n", number);
            else
                System.out.printf("Number %d is not a palindrome number.\n", number);
            Input_Handler.displayLines();
        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        Input_Handler.displayLines();
    }

    public static boolean checkPalindrome(int number) {
        int reversedNumber = reverseNumber(number);

        return (reversedNumber == number);
    }

    public static int reverseNumber(int number) {
        int reverseNumber = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            try {
                int rem = tempNumber % 10;
                reverseNumber = Math.addExact(Math.multiplyExact(reverseNumber, 10), rem);
                tempNumber = Math.divideExact(tempNumber, 10);
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Number cannot be calculated due to data-overflow.");
                return -1;
            }
        }

        if (reverseNumber != 0)
            return reverseNumber;

        return -1;
    }
}
