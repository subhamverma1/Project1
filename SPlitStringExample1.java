import java.util.Scanner;
public class SPlitStringExample1
{
    public static void main(String[] args) {
        String str="Hello IIMA , I am subham verma";
        Scanner sc=new Scanner(str);
        while(sc.hasNext())
        {
            String tokens=sc.next();
            System.out.println(tokens);
        }
        sc.close();
        ScannerNextIntExample2.calculation(args);
                
    }
}