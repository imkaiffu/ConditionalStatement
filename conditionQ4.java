import java.util.Scanner;

public class conditionQ4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the URL ");
        String url=sc.nextLine();

        String protocol=url.substring(0, url.indexOf(":"));

        if (protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol ");
        }
        else if (protocol.equals("ftp")){
            System.out.println("file transfer protocol ");
        }
        else if(protocol.equals("https")){
            System.out.println("Hypertext Transfer Protocol secure");
        }

        String exl=url.substring(url.lastIndexOf(".")+1);
        if (exl.equals("com")){
            System.out.println("commercial ");
        }
        else if(exl.equals("org")){
            System.out.println("organization");
        }
        else if(exl.equals("net")){
            System.out.println("Network");
        }
    }
}
