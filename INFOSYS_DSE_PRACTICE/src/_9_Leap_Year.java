public class _9_Leap_Year {
    public static void main(String[] args) {
        System.out.println("Program to check if a given year is a leap year or not.");
        System.out.println();
        System.out.println();

        displayLines();
        int year = 0;
        System.out.println("Please enter the year that you want to check :- ");
        while (true) {
            year = Input_Handler.getInput("Enter year = ");

            if (year != 0)
                break;
            System.out.println("Error : Year cannot be zero !");
        }

        displayLines();
        checkLeapYear(year);
        displayLines();

        System.out.println();
        System.out.println("End of program reached.");
        displayLines();
    }

    public static void displayLines() {
        for (int i = 0; i < 100; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void checkLeapYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            System.out.printf("Thus, the year %d is a leap year.\n", year);
        else
            System.out.printf("So, the year %d is not a leap year.\n", year);
    }
}
