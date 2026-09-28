import java.util.Scanner;

public class _11_Leap_Year_Level_3 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int firstValue = inputObj.nextInt();
        int secondValue = inputObj.nextInt();

        displayLeapYearsCount(firstValue, secondValue);
        inputObj.close();
    }

    public static void displayLeapYearsCount(int firstValue, int secondValue) {
        int leapYearsCount = 0;
        for (int i = firstValue; i <= secondValue; i++) {
            if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
                leapYearsCount++;
        }

        System.out.println(leapYearsCount);
    }
}
