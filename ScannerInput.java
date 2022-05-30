import java.util.Scanner;
public class ScannerInput {
 public static void main (String [] args)
 {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter string:\n");
     String str = sc.nextLine();
     System.out.println("Enter number:\n");
     int num = sc.nextInt();
     System.out.println("Enter float number:\n");
     float float_num = sc.nextFloat();
     System.out.println("You entered the string\n "+str);   
     System.out.println("You entered the number:\n "+num);
     System.out.println("You entered the float_number\n"+float_num);
    sc.close();   


 }
 }   

