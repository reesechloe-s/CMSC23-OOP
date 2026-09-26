//import java.util.Scanner;
//
//public class LeftTriangle {
//    Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args){
//        System.out.print("Height: ");
//        int h = scanner.nextInt();
//        for (int i = 0; i < h; i ++){
//            System.out.println("*");
//        }
//        System.out.println();
//    }
//}
// MY ERROR HERE: DECLARYING SCANNER AS A FIELD AT THE CLASS LEVEN INSTEAD
//OF THE MAIN METHOD
//MAIN IS STATIC, CANNOT DIRECTLY ACCESS NON-STATIC FIELDS WITHOUT AN INSTANCE

import java.util.Scanner;

public class LeftTriangle{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Height: ");
        int h = scanner.nextInt();

        for (int i = 0; i < h; i++){
            for (int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}