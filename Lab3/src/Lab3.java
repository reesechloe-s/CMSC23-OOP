import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Lab3 {
    static Scanner scanner = new Scanner(System.in); // ginawa kong static so other methods can use it
    public static void main(String[] args){
        int choice = 0;
        int number = 0;
        boolean hasNumber = false;

        do {
            displayMenu();
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Please enter your choice.");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1:
                    number = enterNumber();
                    hasNumber = true;
                    break;
                case 2:
                    System.out.println(findLowestValue(hasNumber, number));
                    break;
                case 3:
                    System.out.println(checkPalindrome(hasNumber, number));
                    break;
                case 4:
                    displayGoodbye();
                    break;
                default:
                    System.out.println("Please select between 1 to 4");
            }
            System.out.println();
        } while (choice != 4);
            scanner.close();
    }

    public static void displayMenu() {
        System.out.println("1. Enter a number");
        System.out.println("2. Display the digit with the lowest value");
        System.out.println("3. Check if the number is a palindrome");
        System.out.println("4. Quit");
        System.out.print("Your choice: ");
    }

    public static int enterNumber() {
        System.out.print("Enter a number: ");
        if (scanner.hasNextFloat()) {
            return Math.abs(Math.round(scanner.nextFloat())); //combined Math.abs and Math.round in one line for conciseness (?) and readability
        } else {
            scanner.next();
            return 0;
        }
    }
    public static String findLowestValue(boolean hasNumber, int n) {
//        Ensure this is a String. When I used int before, it returned the unicode of the number instead.
        if (!hasNumber) {
            return "Enter a number first.";
        }
        String numStr = "" + n; // concatenation method (empty string plus the integer converts it to text)
        char lowest = numStr.charAt(0); // charAt method ay nasa slide and we needed to convert the int to String first hence the code above
        for (int i = 1; i < numStr.length(); i++) {
            if(numStr.charAt(i) < lowest) {
                lowest = numStr.charAt(i);
            }
        }
        return "" + lowest; // need concatenation since lowest is char and not string here. return type is string.
    }

    public static String checkPalindrome(boolean hasNumber, int n) {
        if (!hasNumber) {
            return "Enter a number first.";
        }
        String origStr = "" + n;
        String reversedStr = "";
        for (int i = origStr.length() - 1; i >=0; i--) {
            reversedStr = reversedStr + origStr.charAt(i);
        }
        if (origStr.equals(reversedStr)) {
            return n + "-> yes";
        } else {
            return n + "-> no";
        }
        // before, we used public static boolean and just returned the true or false but decided to follow the lab example output
    }

    public static void displayGoodbye() {
        Calendar today = Calendar.getInstance();
        SimpleDateFormat formatter = new SimpleDateFormat("MMMM d, yyyy h:mm:ss aaa");
        String formattedDate = formatter.format(today.getTime());
        System.out.println("Goodbye! Today is " + formattedDate);
    }
}

//SANTIAGO NOTES
//made the scanner declaration at the class level static so all the programmer-defined methods can access it na di na need na i-pass as parameter
//had both hasNextInt() and hasNextFloat() check before sa case 2. removed it since redundant
//decided to use concatenation method to convert the number to string and use charAt method to compare digits for palindrome check
//discovered the .equals() method for comparison
// at first, may mga logic pa sa cases pero we moved the !hasNumber validation and other stuff to the defined methods as it looks cleaner

//some clarification we have
// (0) sa link po doon sa date and time sa slides, aaa ang format for AM/PM i think. required po bang tatlong 'a' yun or kahit isa lang?

//to practice:
//calendar, date, and time

// BEA NOTES
//used charAt to traverse thru the numbers, despite not having the numerical value as it was converted to string, their corresponding ASCII values were actually sufficient to be a point of comparison
//combined the abs and round operation for efficiency and neatness
//instead of using booleans for the palindrome validation we changed it to yes or no to adhere to the instructions
