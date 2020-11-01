//program to print the factor of a given number
import java.util.*;
class Main
{
    static void factor(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i == 0)
                System.out.print(i+" ");
        }
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = in.nextInt();
        System.out.println("The factors of "+num+" are ");
        factor(num);
    }
} 
