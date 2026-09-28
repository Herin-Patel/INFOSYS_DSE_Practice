import java.util.Scanner;

public class _16_Grading_System_Level_2 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int testCases = inputObj.nextInt();

        if (testCases <= 0) {
            System.out.println("Invalid test-cases !");
            return;
        }

        int[] studentMarks = new int[5];
        for (int i = 0; i < testCases; i++) {
            getStudentMarks(studentMarks, inputObj);
            displayStudentMarks(studentMarks, i);
        }

        inputObj.close();
    }

    public static void getStudentMarks(int[] studentMarks, Scanner inputObj) {
        for (int i = 0; i < studentMarks.length; i++) {
            studentMarks[i] = inputObj.nextInt();

            if (studentMarks[i] < 0 || studentMarks[i] > 100) {
                System.out.println("Marks cannot be negative or greater than 100 !");
                System.out.println("Please rewrite the marks.");
                studentMarks[i] = 0;
                i--;
            }
        }
    }

    public static void displayStudentMarks(int[] studentMarks, int studentNo) {
        long totalMarks = 0;

        for (int marks : studentMarks)
            totalMarks += marks;

        double percentage = ((double) totalMarks / (studentMarks.length * 100)) * 100;

        System.out.printf("Student %d: %.2f %c\n", studentNo + 1, percentage, getStudentGrade(percentage * 100));
    }

    public static char getStudentGrade(double studentPercentage) {
        if (studentPercentage > 90)
            return 'A';
        else if (studentPercentage > 75)
            return 'B';
        else if (studentPercentage > 60)
            return 'C';
        else if (studentPercentage > 30)
            return 'D';
        else
            return 'F';
    }
}
