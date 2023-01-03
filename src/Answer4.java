import java.util.Scanner;

public class Answer4 {
    //4. Take values of length and breadth of a rectangle from user and check if it is square or not.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Leangth");
        int a = sc.nextInt();
        System.out.println("Enter Breadth");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Its squre");
        } else {
            System.out.println("Its rectangle");

        }
    }
}
