import java.util.Scanner;

public class _10_Leap_Year_Level_2 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int testCases = inputObj.nextInt();
        int[] arry = new int[testCases];

        for (int i = 0; i < testCases; i++) {
            arry[i] = inputObj.nextInt();
        }

        displayLeapYear(arry);
        inputObj.close();
    }

    public static void displayLeapYear(int[] arry) {
        for (int i = 0; i < arry.length; i++) {
            if (((arry[i] % 4 == 0) && (arry[i] % 100 != 0)) || (arry[i] % 400 == 0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
