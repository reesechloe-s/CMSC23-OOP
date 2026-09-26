import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int Int = scanner.nextInt();
        int factorial = 1;

        if (Int >= 0) {
            for (int i = 1; i<= Int; i++){
                factorial *= i;
            }
            System.out.println("Factorial: " + factorial);
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
