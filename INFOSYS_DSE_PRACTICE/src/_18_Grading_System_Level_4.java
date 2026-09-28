import java.util.Arrays;
import java.util.Scanner;

public class _18_Grading_System_Level_4 {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);

        int testNumbers = inputObj.nextInt();

        if (testNumbers <= 0) {
            System.out.println("Test numbers needs to be positive value.");
            return;
        }

        EqualStudent[] studentArry = new EqualStudent[testNumbers];

        for (int studentIteration = 0; studentIteration < testNumbers; studentIteration++) {
            String name = inputObj.next();

            int totalSum = 0;
            for (int marksIteration = 0; marksIteration < 5; marksIteration++) {
                int currentMarks = inputObj.nextInt();

                if (currentMarks < 0) {
                    System.out.println("Marks cannot be negative ! Please re-write the marks.");
                    currentMarks--;
                    continue;
                }

                totalSum += currentMarks;
            }

            studentArry[studentIteration] = new EqualStudent(name, totalSum);
        }

        Arrays.sort(studentArry, (a, b) -> Integer.compare(b.totalMarks, a.totalMarks));

        int currentRank = 1;

        for (int currentStudent = 0; currentStudent < studentArry.length; currentStudent++) {
            if ((currentStudent > 0) && (studentArry[currentStudent].totalMarks == studentArry[currentStudent - 1].totalMarks)) {
                // Same marks -> so same rank
            } else {
                currentRank += 1;
            }

            System.out.printf("Student %s -> Rank %d\n", studentArry[currentStudent].studentName, currentRank);
        }

        inputObj.close();
    }
}


class EqualStudent {
    String studentName;
    int totalMarks;

    EqualStudent(String studentName, int totalMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
    }
}