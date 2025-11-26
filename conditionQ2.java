// Find the given is year is leap year or not
import java.util.Scanner;

public class conditionQ2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year number");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It's a leap Year");
                } else
                    System.out.println("It's not a leap Year");
            } else {
                System.out.println("It's a leap Year");
            }
        } else {
            System.out.println("It's not a leap year");
        }
    }
}
