import java.util.Scanner;

public class _24_Multiplication_Table_Level_6 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        try {
            int arrySize = inputObj.nextInt();
            if (arrySize <= 0) {
                System.out.println("Please enter a valid positive array size !");
                return;
            }

            int[] myArry = new int[arrySize];
            for (int i = 0; i < arrySize; i++) {
                myArry[i] = inputObj.nextInt();
            }

            findMaximumProductPair(myArry);
        } finally {
            inputObj.close();
        }
    }

    public static void findMaximumProductPair(int[] myArry) {
        int maximumProduct = Integer.MIN_VALUE;
        int firstNumber = 0;
        int secondNumber = 0;

        for (int currentNumber = 0; currentNumber < myArry.length; currentNumber++) {
            for (int nextNumber = currentNumber + 1; nextNumber < myArry.length; nextNumber++) {
                try {
                    int product = Math.multiplyExact(myArry[currentNumber], myArry[nextNumber]);
                    if (product > maximumProduct) {
                        maximumProduct = product;
                        firstNumber = myArry[currentNumber];
                        secondNumber = myArry[nextNumber];
                    } else if (product == maximumProduct) {
                        if (firstNumber < currentNumber) {
                            firstNumber = myArry[currentNumber];
                            secondNumber = myArry[nextNumber];
                        }
                    }
                } catch (ArithmeticException arExpObj) {
                    Input_Handler.displayExceptionMessage(arExpObj, "Product cannot be calculated because of data overflow.");
                }
            }
        }

        System.out.printf("Maximum product from the array : %d\n", maximumProduct);
        System.out.printf("Product pair : %d x %d = %d\n", firstNumber, secondNumber, maximumProduct);
    }
}
