import java.util.*;
public class  ScannerNextIntExample2 {
   public static void calculation(String args[]) {
       int amount;
       int balance;
       Scanner input=new Scanner(System.in);
       System.out.println("ENter the amount:");
       amount=input.nextInt();
       System.out.print("Enter the Total Balance");
       balance=input.nextInt();
       balance=balance-(amount+500);
       System.out.println("THe new balance is "+balance);
       input.close();

   }
}
