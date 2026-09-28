public class _3_Star_Pattern_Left_Half_Pyramid {
    public static void main(String[] args) {
        System.out.println("Program to demonstrate Left half pyramid.");
        System.out.println();
        System.out.println();

        displayPyramid();

        System.out.println();
        System.out.println("End of program reached.");
    }

    public static void displayPyramid() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
