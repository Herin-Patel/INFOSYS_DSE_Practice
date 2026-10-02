import java.util.Scanner;

public class _20_Multiplication_Table_Level_2 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int testCases = inputObj.nextInt();

        if (testCases <= 0) {
            System.out.println("Test cases cannot be negative or zero !");
            return;
        }

        int number = 0, length = 0;
        for (int i = 0; i < testCases; i++) {
            for (int j = 0; j < 2; j++) {
                number = inputObj.nextInt();
                length = inputObj.nextInt();

                displayMultiplicationTable(number, length);
                System.out.println();
            }
        }
        inputObj.close();
    }

    public static void displayMultiplicationTable(int number, int length) {
        int result = 0;
        for (int factor = 1; factor <= length; factor++) {
            try {
                result = Math.multiplyExact(number, factor);
                System.out.printf("%d ", result);
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Result cannot be displayed because of data overflow.");
                break;
            }
        }
    }
}
