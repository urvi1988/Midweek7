import java.util.Scanner;

public class Answer7 {
    // 7. Take input of age of 3 people by user and determine oldest and youngest among
    //them.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Person 1");
        int Age1 = sc.nextInt();
        System.out.println("Person 2");
        int Age2 = sc.nextInt();
        System.out.println("Person 3");
        int Age3 = sc.nextInt();


        if (Age1 < Age2 && Age1 < Age3) {
            System.out.println("Person 1 is the youngest");
        } else if (Age2 < Age1 && Age2 < Age3) {
            System.out.println("Persson 2 is the youngest");
        } else if (Age3 < Age1 && Age3 < Age2) {
            System.out.println("Person 3 is the youngest");
        } else {
            System.out.println("Same Age");
        }

        if (Age1 > Age2 && Age1 > Age3) {
            System.out.println("Person 1 is the oldest");
        } else if (Age2 > Age1 && Age2 > Age3) {
            System.out.println("Persson 2 is the oldest");
        } else if (Age3 > Age1 && Age3 > Age2) {
            System.out.println("Person 3 is the oldest");
        } else {
            System.out.println("Same Age");

        }
    }
}

