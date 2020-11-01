//program to find if a given number is odd or even
import java.util.*;
class oddeven
{
    public static void main(String args[])
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        num = in.nextInt();

        if(num%2 == 0)
            System.out.println(num+" is even");
        else
            System.out.println(num+" is odd");
        
    }
} 
