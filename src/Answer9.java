import java.util.Scanner;

public class Answer9 {
    // 9. Modify the above question to allow student to sit if he/she has medical cause. Ask
    //user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of classes held");
        double a=sc.nextDouble();
        System.out.println("Enter number of classes attanded");
        double b=sc.nextDouble();
        double c=(b/a*100);

        if (c<75.0) {
            System.out.println("Student is not allowed to sit in exam, do you have any medical cause or not");
            char d= sc.next(). charAt(0);
            if(d=='y') {
                System.out.println("You are allowed to sit in exam");
            } else if (d=='n'){
                System.out.println("You can not sit in exam");  }
        } else {
            System.out.println("Student is allowed to sit in exam");
        }
        }
    }


