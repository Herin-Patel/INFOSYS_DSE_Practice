public class _2_Star_Pattern_Reverse_Right_Half_Pyramid {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate Reverse right half pyramid.");
        System.out.println();
        System.out.println();

        displayPyramid();

        System.out.println();
        System.out.println("End of program reached.");
    }

    public static void displayPyramid() {
        for
        (int i = 5; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
