import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedInput1 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader ( new InputStreamReader(System.in));
        System.out.println("Enter string");
        String s=br.readLine();
        System.out.println("You entered "+s);

    }
    
}
