import java.util.Scanner;

public class _12_Leap_Year_Level_4 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int month = inputObj.nextInt();
        int year = inputObj.nextInt();

        // Check if a valid month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month !");
            return;
        }

        // Check if a valid year
        if (year <= 0) {
            System.out.println("Invalid year !");
            return;
        }

        daysOfMonthCount(month, year);

        inputObj.close();
    }

    public static boolean isLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            return true;
        return false;
    }

    public static void daysOfMonthCount(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            System.out.println(31);
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            System.out.println(30);
        else if (month == 2) {
            if (isLeapYear(year))
                System.out.println(29);
            else
                System.out.println(28);
        } else {
            System.out.println("Invalid month !");
        }
    }
}
