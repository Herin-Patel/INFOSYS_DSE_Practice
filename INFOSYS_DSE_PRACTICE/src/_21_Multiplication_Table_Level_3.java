import java.util.Scanner;

public class _21_Multiplication_Table_Level_3 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        try {
            int nNumber = inputObj.nextInt();
            if (nNumber < 0) {
                System.out.println("The number cannot be a negative number !");
                return;
            }

            int kMultiples = inputObj.nextInt();
            if (kMultiples == 0) {
                System.out.println("0");
                return;
            } else if (kMultiples < 0) {
                System.out.println("Multiple of given number cannot be a negative multiple !");
                return;
            }

            calculateSum(nNumber, kMultiples);
        } finally {
            inputObj.close();
        }
    }

    public static void calculateSum(int nNumber, int kMultiples) {
        int sum = 0, result = 0;

        for (int i = 1; i <= kMultiples; i++) {
            try {
                result = Math.multiplyExact(nNumber, i);
                sum = Math.addExact(sum, result);
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Number cannot be displayed because sum is too large to be displayed.\n");
                return;
            }
        }

        System.out.printf("%d", sum);
    }
}
