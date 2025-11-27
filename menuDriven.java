import java.util.Scanner;

public class menuDriven {
    public static void main(String[]args){
        System.out.println("Menu");
        System.out.println("==");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");

        System.out.println("Enter any Two Number!");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt() , b=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter a Option in Word!");
        String operation=sc.nextLine();
        switch(operation){
            case "ADD": System.out.println(a+b);
            break;
            case "SUB": System.out.println(a-b);
                break;
            case "MUL": System.out.println(a*b);
                break;
            case "DIV": System.out.println(a/b);
                break;
            default: System.out.println("Operation not exist !");
        }




    }
}
