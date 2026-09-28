import java.util.Scanner;

public class _14_Leap_Year_Level_6 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        String dateString = inputObj.nextLine().trim();

        String[] dateParts = dateString.split("-");

        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);

        // Validate year
        if (year <= 0) {
            System.out.println("Invalid year !");
            return;
        }

        // Validate month
        if (month < 1 || month > 12) {
            System.out.println("Invalid month !");
            return;
        }

        // Validate day
        if (day < 1 || day > 31) {
            System.out.println("Invalid day !");
            return;
        }

        calculateDayOfYear(year, month, day);

        inputObj.close();
    }

    public static void calculateDayOfYear(int year, int month, int day) {
        int[] monthValue = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (isLeapYear(year))
            monthValue[1] = 29;

        int daysSum = 0;

        for (int monthIterator = 1; monthIterator < month; monthIterator++) {
            daysSum += monthValue[monthIterator - 1];
        }

        daysSum += day;

        System.out.println(daysSum);
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }
}
