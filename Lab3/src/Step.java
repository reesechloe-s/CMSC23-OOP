import java.util.Scanner;

public class Step {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Starting Integer: ");
        int StartInt = scanner.nextInt();
        System.out.println("Ending Integer: ");
        int EndInt = scanner.nextInt();
        System.out.println("Step value: ");
        int Step = scanner.nextInt();

        for (int i = StartInt; i <= EndInt; i += Step) {
            System.out.println(i);
        }
    }
}
