import java.util.Scanner;

public class _23_Multiplication_Table_Level_5 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        try {
            int arrySize = inputObj.nextInt();

            if (arrySize <= 0) {
                System.out.println("Array size must be a valid positive number greater than zero !");
                return;
            }

            int[] myArry = new int[arrySize];
            for (int i = 0; i < arrySize; i++) {
                myArry[i] = inputObj.nextInt();
            }

            int desiredProduct = inputObj.nextInt();
            if (desiredProduct < 0) {
                System.out.println("Desired product cannot be a negative number !");
                return;
            }

            findPossiblePair(myArry, desiredProduct);
        } finally {
            inputObj.close();
        }
    }

    public static void findPossiblePair(int[] myArry, int desiredProduct) {
        for (int currentNumber = 0; currentNumber < myArry.length; currentNumber++) {
            for (int nextNumber = currentNumber + 1; nextNumber < myArry.length; nextNumber++) {
                try {
                    if (Math.multiplyExact(myArry[currentNumber], myArry[nextNumber]) == desiredProduct) {
                        System.out.printf("%d x %d = %d\n", myArry[currentNumber], myArry[nextNumber], desiredProduct);
                    }
                } catch (ArithmeticException arExpObj) {
                    Input_Handler.displayExceptionMessage(arExpObj, "Product cannot be calculated due to data overflow.");
                }
            }
        }
    }
}
