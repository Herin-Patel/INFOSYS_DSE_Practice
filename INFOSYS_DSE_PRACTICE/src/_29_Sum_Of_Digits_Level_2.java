import java.util.Scanner;

public class _29_Sum_Of_Digits_Level_2 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        try {
            int number = inputObj.nextInt();

            if (number < 0) {
                System.out.println("Number cannot be a negative number !");
                return;
            }
            calculateEvenSum(number);
        } finally {
            inputObj.close();
        }
    }

    public static void calculateEvenSum(int number) {
        int sum = 0;

        while (number > 0) {
            try {
                int rem = number % 10;
                if (rem % 2 == 0)
                    sum = Math.addExact(sum, rem);
                number = Math.divideExact(number, 10);
            } catch (ArithmeticException arExpObj) {
                System.out.println("Exception caught : Number cannot be calculated because of data overflow.");
                System.out.printf("Exception : %s\n", arExpObj.getClass().getSimpleName());
                System.out.printf("Exception : %s\n", arExpObj.getMessage());
                return;
            }
        }

        System.out.printf("%d\n", sum);
    }
}
