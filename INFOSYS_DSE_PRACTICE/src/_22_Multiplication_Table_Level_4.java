import java.util.Scanner;

public class _22_Multiplication_Table_Level_4 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        try {
            int number = inputObj.nextInt();
            if (number < 0) {
                System.out.println("Number cannot be a negative number !");
                return;
            } else if (number == 0) {
                System.out.println("0");
                return;
            }

            int lowerLimit = inputObj.nextInt();
            if (lowerLimit < 0) {
                System.out.println("Lower limit cannot be a negative number !");
                return;
            }

            int upperLimit = inputObj.nextInt();
            if (upperLimit < 0) {
                System.out.println("Upper limit cannot be a negative number !");
                return;
            } else if (upperLimit < lowerLimit) {
                System.out.println("Upper limit cannot be smaller than lower limit.");
                return;
            }

            if (upperLimit == 0 && lowerLimit == 0) {
                System.out.println("0");
                return;
            }

            calculateMultiples(number, lowerLimit, upperLimit);
        } finally {
            inputObj.close();
        }
    }

    public static void calculateMultiples(int number, int lowerLimit, int upperLimit) {
        int counter = 0;

        for (int iterator = lowerLimit; iterator <= upperLimit; iterator++) {
            try {
                int currentNumber = Math.addExact(number, iterator);

                if (currentNumber % number == 0)
                    counter++;
            } catch (ArithmeticException arExpObj) {
                Input_Handler.displayExceptionMessage(arExpObj, "Number cannot be displayed due to data overflow.");
                return;
            }
        }

        System.out.println(counter);
    }
}
