import java.util.Scanner;

public class Answer1 {
    // 1. Take 10 integers from keyboard using loop and print their average value on the
    //screen.

    public static void main(String[] args) {  // main method
        Scanner sc = new Scanner(System.in); // scanner class
        int sum=0;
        for (int i = 0; i < 10; i++) { // for loop method

            System.out.println("Enter Number");
            sum = sum + sc.nextInt(); // read input from user
        }
        double average = sum/10; // method for average

        System.out.println("Average is" + average); // will print statment
    }
}