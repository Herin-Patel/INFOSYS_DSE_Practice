import java.util.InputMismatchException;
import java.util.Scanner;

public class _32_Sum_Of_Digits_Level_3 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        try {
            int number = inputObj.nextInt();
            if (number < 0) {
                System.out.println("Please enter a valid positive number !");
                return;
            }

            calculateDigitalRoot(number);
        } catch (InputMismatchException inExpObj) {
            displayExceptionMessage(inExpObj, "Input given by user does not match required datatype.");
        } catch (Exception expObj) {
            displayExceptionMessage(expObj, "General exception caught.");
        } finally {
            inputObj.close();
        }
    }

    public static void displayExceptionMessage(Exception expObj, String message) {
        System.out.println();
        System.out.printf("Exception : %s\n", message);
        System.out.printf("Exception : %s\n", expObj.getClass().getSimpleName());
        System.out.printf("Exception : %s\n", expObj.getMessage());
    }

    public static void calculateDigitalRoot(int number) {
        while (number >= 10) {
            number = calculateSum(number);
            if (number == -1)
                return;
        }

        System.out.printf("%d\n", number);
    }

    public static int calculateSum(int number) {
        int sum = 0;

        while (number > 0) {
            try {
                int rem = number % 10;
                sum = Math.addExact(sum, rem);
                number = Math.divideExact(number, 10);
            } catch (ArithmeticException arExpObj) {
                displayExceptionMessage(arExpObj, "Number cannot be calculated due to data-overflow.");
                return -1;
            }
        }
        return sum;
    }
}
