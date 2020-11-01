//program to print the fibonacci series
import java.util.*;
class Main
{
    public static void main(String args[])
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        num = in.nextInt();
        int a = 0;
        int b = 1;
        int temp = 1;
        while(a<=num)
        {
            System.out.println(a);
            a = temp;
            temp = b;
            b = b + a;
        }

    }
} 
