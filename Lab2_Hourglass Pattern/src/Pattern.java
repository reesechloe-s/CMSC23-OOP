import java.util.*;

public class Pattern {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            for (int i = 0; i <= number/2; i++) {
                for (int j = i; j > 0; j --) {
                    System.out.print(" ");
                }
                for (int j = number - 2*i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
//                number/2 fixed the spacing
//                alignment fixed when just adapting the code and tweaking it into
//                number / 2 - 1 removed the redundancy
            }
            for (int i = number/2 - 1; i >= 0; i--) {
                for (int j = i; j > 0; j --) {
                    System.out.print(" ");
                }
                for (int j = number - 2*i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
//            for (int k = number - 1; k <= number; k++) {
//                for (int l = 0; l > k; l --) {
//                    System.out.print(" ");
//                }
//                for (int l = 0; l > number - 2*k; l--) {
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
            scanner.close();
        } else {
            System.out.println("Incorrect");
        }
    }
}