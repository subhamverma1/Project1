import java.util.Scanner;

public class switchANdscanNextAtChar0 {
   public static void main(String [] args){

    int x=0,y=0;
    System.out.println("Enter a move : ");
    Scanner sc = new Scanner(System.in);
    char move=sc.next().charAt(0); /* To read a char, we use next().charAt(0). 
    next() function returns the next token/word in the input as a string 
    and charAt(0) function returns the first character in that string*/
    sc.close();

    switch(move)  /*After Java 7 , we can aslo use string in switch*/
    {
        case 'L' : x--;
        break;
        case 'R': x++;
        break;
        case 'T' : y++;
        break;
        case 'B' : y--;
        break;
        default: System.out.println("Invalid");
    };
    System.out.println(x+" "+y);
   }
}
