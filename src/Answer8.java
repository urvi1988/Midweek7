import java.util.Scanner;

public class Answer8 {
    // 8. A student will not be allowed to sit in exam if his/her attendence is less than 75%.
    //Take following input from user
    //Number of classes held
    //Number of classes attended.
    //And print
    //percentage of class attended
    //Is student is allowed to sit in exam or not.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of classes held");
        double a=sc.nextDouble();
        System.out.println("Enter number of classes attanded");
        double b=sc.nextDouble();
        double c=(b/a*100);

        if (c<75.0) {
            System.out.println("Student is not allowed to sit in exam");
        } else {
            System.out.println("Student is allowed to sit in exam");
        }

    }
}
