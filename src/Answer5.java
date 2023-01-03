import java.util.Scanner;

public class Answer5 {
    // 5. Take two int values from user and print greatest among them.
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter value of A:");
        int A= sc.nextInt();
        System.out.println("Enter value of B:");
        int B= sc.nextInt();

        if(A>B) {
            System.out.println("Greatest number:"+ A);
        } else {
            System.out.println("Greatest number"+B);
        }
    }
}
