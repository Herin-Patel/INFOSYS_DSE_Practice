import java.util.Scanner;

public class _15_Grading_System {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate school grading system.");
        System.out.println();
        System.out.println();


        int[] studentMarks = new int[5];
        String[] subjects = {"Maths", "Science", "English", "Computer", "Social Science"};

        getStudentMarks(subjects, studentMarks);

        displayStudentMarks(subjects, studentMarks);

        displayStudentResults(studentMarks);

        System.out.println();
        System.out.println("End of program reached.");
        displayLines();

        Input_Handler.closeScanner();
    }

    public static void displayLines() {
        for (int i = 0; i < 100; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void getStudentMarks(String[] subjects, int[] studentMarks) {
        displayLines();
        System.out.println("Please enter the marks of the student in following manner :- ");
        for (int i = 0; i < subjects.length; i++) {
            studentMarks[i] = Input_Handler.getInput("Enter marks in " + subjects[i] + " = ");
        }
    }

    public static void displayStudentMarks(String[] subjects, int[] studentMarks) {
        System.out.println();
        displayLines();

        System.out.println("The marks obtained by student in each subject are given as follows :-");

        for (int i = 0; i < subjects.length; i++)
            System.out.printf("%s : %d\n", subjects[i], studentMarks[i]);
        System.out.println();
    }

    public static void displayStudentResults(int[] studentMarks) {
        int totalMarks = 0;

        for (int marks : studentMarks)
            totalMarks += marks;

        float averageMarks = (float) totalMarks / (studentMarks.length * 100);

        displayLines();
        System.out.println("Hence, following are the results of the student based on marks obtained in each subject :-");
        System.out.printf("Total marks = %d\n", totalMarks);
        System.out.printf("Total percentage = %.2f\n", averageMarks * 100);
        System.out.printf("Total grade = %c\n", getStudentGrade(averageMarks * 100));

    }

    public static char getStudentGrade(float percentage) {
        if (percentage > 90)
            return 'A';
        else if (percentage <= 90 && percentage > 75)
            return 'B';
        else if (percentage <= 75 && percentage > 60)
            return 'C';
        else if (percentage <= 60 && percentage > 30)
            return 'D';
        else if (percentage <= 30)
            return 'F';

        return 'F';
    }
}
