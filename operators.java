import java.io.IOException;
import java.util.Scanner;

public class operators {

     public static void main(String[] args) throws IOException 
    { 
        String user = "admin" , pwd = "ADMIN";
      
        Scanner sc = new Scanner(System.in);
      
        String iu = sc.next();
      
        String ip = sc.next();
        sc.close();
        if(user.equals(iu) && pwd.equals(ip))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Try Again");
        }
       
    } 
    
}
