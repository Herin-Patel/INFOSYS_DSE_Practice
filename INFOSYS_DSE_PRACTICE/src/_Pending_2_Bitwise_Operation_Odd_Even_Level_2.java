
public class _Pending_2_Bitwise_Operation_Odd_Even_Level_2 {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate odd or even number using bitwise operations.");
        System.out.println();
        System.out.println();

        try {
            Input_Handler.displayLines();
            System.out.println("Please enter the number that you want to check for odd-even :-");
            int userInput = Input_Handler.getInput("Enter the number = ");

            System.out.printf("The number entered by user is = %d\n", userInput);
            if (checkEven(userInput))
                System.out.printf("Number %d is an even number.\n", userInput);
            else
                System.out.printf("Number %d is an odd number.\n", userInput);
        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
        Input_Handler.displayLines();
    }

    public static boolean checkEven(int userNumber) {
        if ((userNumber & 1) == 0)
            return true;

        return false;
    }
}
