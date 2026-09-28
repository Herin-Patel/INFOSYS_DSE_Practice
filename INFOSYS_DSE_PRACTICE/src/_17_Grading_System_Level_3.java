import java.util.Arrays;
import java.util.Scanner;

public class _17_Grading_System_Level_3 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int testNumber = inputObj.nextInt();

        Student[] studentArray = new Student[testNumber];

        for (int studentIteration = 0; studentIteration < testNumber; studentIteration++) {

            int totalSum = 0;
            for (int marksIteration = 0; marksIteration < 5; marksIteration++) {
                int currentMarks = inputObj.nextInt();

                if (currentMarks < 0 || currentMarks > 100) {
                    System.out.println("Marks cannot be negative or greater than 100 !");
                    System.out.println("Please re-enter the marks");
                    studentIteration--;
                    currentMarks = 0;
                    continue;
                }

                totalSum += currentMarks;
            }

            studentArray[studentIteration] = new Student(studentIteration + 1, totalSum);
        }

        Arrays.sort(studentArray, (a, b) -> Integer.compare(b.totalMarks, a.totalMarks));

        for (Student currentStudent : studentArray)
            System.out.printf("Student %d\n", currentStudent.studentNo);

        inputObj.close();
    }
}

class Student {
    protected int studentNo;
    protected int totalMarks;

    Student(int studentNo, int totalMarks) {
        this.studentNo = studentNo;
        this.totalMarks = totalMarks;
    }
}
