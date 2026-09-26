import java.util.Scanner;

public class TotalSum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        for ( int i = 0; i < 5; i ++) {
            System.out.println("Input an Integer: ");
            int Int = scanner.nextInt();
            sum += Int;
        }
        System.out.println("Total Sum: " + sum);
        System.out.printf("Average: %.2f", (double) sum/5);

    }
}
