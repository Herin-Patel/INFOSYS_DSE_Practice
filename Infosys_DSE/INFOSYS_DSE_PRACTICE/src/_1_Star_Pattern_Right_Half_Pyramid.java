public class _1_Star_Pattern_Right_Half_Pyramid {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate right half pyramid.");
        System.out.println();
        System.out.println();

        displayPyramid();

        System.out.println();
        System.out.println("End of program reached.");
    }

    public static void displayPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
