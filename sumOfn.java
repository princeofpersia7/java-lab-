//program finds the sum of n numbers
import java.util.*;
class sumOfn
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int num,sum=0;
        System.out.println("Enter a number");
        num = in.nextInt();
        for(int i = 1;i<=num;i++)
            sum += i;
        System.out.println("The sum of "+num+" natural numbers is "+sum);
    }
} 
