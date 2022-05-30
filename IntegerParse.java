import java.io.*;
public class IntegerParse {
   public static void main(String [] args) throws NumberFormatException, IOException {
       BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter Integer");
       int x =Integer.parseInt(br.readLine());
       System.out.println("you entered "+x);

   }
   }

