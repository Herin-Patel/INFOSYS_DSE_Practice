import java.util.Scanner;

public class _13_Leap_Year_Level_5 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int day = inputObj.nextInt();
        int month = inputObj.nextInt();
        int year = inputObj.nextInt();

        // Validate day
        if (day < 1 || day > 31) {
            System.out.println("Invalid day !");
            return;
        }

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month !");
            return;
        }

        // Validate year
        if (year < 1) {
            System.out.println("Invalid year !");
            return;
        }

        checkValidDate(day, month, year);

        inputObj.close();
    }

    public static void checkValidDate(int day, int month, int year) {
        int[] monthValue = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year))
            monthValue[1] = 29;

        if (day >= 1 && day <= monthValue[month - 1])
            System.out.println("VALID");
        else
            System.out.println("INVALID");
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}
