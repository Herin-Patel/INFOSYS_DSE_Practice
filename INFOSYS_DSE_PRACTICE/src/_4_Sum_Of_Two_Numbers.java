import java.util.Scanner;

public class _4_Sum_Of_Two_Numbers {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate sum of two numbers.");
        System.out.println();
        System.out.println();

        Scanner inputObj = new Scanner(System.in);

        System.out.println("Please enter the first number :- ");
        System.out.print("First number : ");
        int firstNum = inputObj.nextInt();

        System.out.println();
        System.out.println("Now please enter the second number :- ");
        System.out.print("Second number : ");
        int secondNum = inputObj.nextInt();

        System.out.println();
        System.out.println("Thus, the two numbers entered by user are :- ");
        System.out.println("First number : " + firstNum);
        System.out.println("Second number : " + secondNum);

        System.out.println();
        System.out.printf("Sum of %d and %d = %d\n", firstNum, secondNum, sum(firstNum, secondNum));

        System.out.println();
        System.out.println("End of program reached.");
    }

    public static int sum(int firstNum, int secondNum) {
        return (firstNum + secondNum);
    }
}
