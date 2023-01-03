import java.util.Scanner;

public class Answer10 {
    // 10. Write a program to print the sum of two numbers entered by user by defining your
    //own method.

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number1:");
        int num1=sc.nextInt();
        System.out.println("Enter number2:");
        int num2=sc.nextInt();

        int sum= num1+ num2;
        System.out.println();
        System.out.println("sum:"+sum);
    }
}

