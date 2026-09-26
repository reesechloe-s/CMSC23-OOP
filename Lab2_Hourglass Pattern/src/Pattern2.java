import java.util.*;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            for (int i = 0; i < number; i++) {
                for (int j = i; j > 0; j --) {
                    System.out.print(" ");
                }
                for (int j = number - 2*i; j > 0; j--) {
                    System.out.print("*");
                }
                System.out.println();
            } for (int k = 0; k < number; k++) {
                for (int l = 1; l<= k; l --) {
                    System.out.print(" ");
                }
                for (int l = 1; l > number - 2*k; l--) {
                    System.out.print("*");
                }
                System.out.println();
            }
            scanner.close();
        } else {
            System.out.println("Incorrect");
        }
    }
}