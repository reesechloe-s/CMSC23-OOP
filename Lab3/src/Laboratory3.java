import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Laboratory3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        int number = 0;
        boolean hasNumber = false;

        do {
            displayMenu();
            System.out.print(">");

            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // clear invalid input
                continue;
            }

            // Switch statement for menu options
            switch (choice) {
                case 1:
                    System.out.print("Input a positive integer: ");
                    if (scanner.hasNextInt()) {
                        number = scanner.nextInt();
                        hasNumber = true;
                    }
                    break;

                case 2:
                    if (!hasNumber) {
                        System.out.println("Please enter a positive integer first (Option 1).");
                    } else {
                        int highest = findHighestDigit(number);
                        System.out.println(highest);
                    }
                    break;

                case 3:
                    if (!hasNumber) {
                        System.out.println("Please enter a positive integer first (Option 1).");
                    } else {
                        int reversed = reverseNumber(number);
                        System.out.println(reversed);
                    }
                    break;

                case 4:
                    LocalDateTime currentDateTime = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy h:mm:ss a");
                    String formattedDateTime = currentDateTime.format(formatter);

                    System.out.println("Your session has ended. The current time is " + formattedDateTime);
                    break;

                default:
                    System.out.println("Invalid choice. Please select between 1 and 4.");
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }

    // Programmer-defined method: Display opening message and menu
    public static void displayMenu() {
        System.out.println("Please choose a number:");
        System.out.println("(1)Enter a positive integer");
        System.out.println("(2)Display the digit with the highest value.");
        System.out.println("(3)Display the number backwards");
        System.out.println("(4)Quit");
    }

    // Programmer-defined method: Find the highest digit
    public static int findHighestDigit(int n) {
        int max = 0;
        n = Math.abs(n); // handle positive integers
        while (n > 0) {
            int digit = n % 10;
            if (digit > max) {
                max = digit;
            }
            n /= 10;
        }
        return max;
    }

    // Programmer-defined method: Reverse the number
    public static int reverseNumber(int n) {
        int reversed = 0;
        n = Math.abs(n);
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }
}
