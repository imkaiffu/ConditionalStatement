// Find a number is odd or even
// Find a person is young or old
// Find grades for given marks

import java.util.Scanner;

public class condition2 {
    public static void main(String[]args){
        int k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        k=sc.nextInt();
        if (k%2==0){
            System.out.println("The Number is Even ");
        }
        else {
            System.out.println("The Number is Odd ");
        }


        int age;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter age of a Person ");
        age=s.nextInt();
        if (age>=14 && age<=55){
            System.out.println("Person is Adult.");
        }
        else {
            System.out.println("Person is not Young.");
        }


    }
}
