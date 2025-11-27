// Display type of Website

import java.util.Scanner;

public class switchCaseQ3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter url ");
        String url=sc.nextLine();

        String protocol=url.substring(0, url.indexOf(":"));
        switch(protocol){
            case "http": System.out.println("Hypertext Transfer protocol ");
            break;
            case "ftp": System.out.println("File Transfer protocol ");
                break;
            case "www": System.out.println("world wide web ");
                break;
        }

        String exl=url.substring(( url.lastIndexOf(".")+1));
        switch(exl){
            case "com": System.out.println("commercial");
            break;
            case "gov": System.out.println("Government");
                break;
            case "net": System.out.println("cNetwork");
                break;
            case "org": System.out.println("organisation");
                break;
        }



    }
}
