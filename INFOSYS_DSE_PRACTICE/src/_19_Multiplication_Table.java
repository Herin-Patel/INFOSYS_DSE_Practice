public class _19_Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate multiplication table.");
        System.out.println();
        System.out.println();

        try {
            Input_Handler.displayLines();
            System.out.println("Please enter the number for which you want the multiplication table :-");
            int number = Input_Handler.getInput("Enter the number = ");

            if (number < 0) {
                System.out.println("Number cannot be negative !");
                return;
            }

            System.out.println();
            System.out.println("Now, please enter the length till which you want the multiplication table :-");
            int length = Input_Handler.getInput("Enter the length = ");

            if (length < 0) {
                System.out.println("Length cannot be negative !");
                return;
            }

            displayMultiplicationTable(number, length);
        } finally {
            Input_Handler.closeScanner();
        }

        System.out.println();
        System.out.println("End of program reached.");
    }

    public static void displayMultiplicationTable(int number, int length) {
        Input_Handler.displayLines();
        System.out.printf("So, the multiplication table of %d till %d is given as follows :-\n", number, length);


        int result = 0;
        for (int factor = 1; factor <= length; factor++) {
            try {
                result = Math.multiplyExact(number, factor);
                System.out.printf("%d x %d = %d\n", number, factor, result);
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Result cannot be displayed because of data overflow.");
                break;
            }
        }

        Input_Handler.displayLines();
    }
}
