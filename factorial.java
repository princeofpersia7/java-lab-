//program to print the factorial of first n natural numbers
import java.util.*;
class Main
{
    int factorial(int n)
    {
        int fact = 1;
        for(int i =1; i<=n; i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int num;
        Scanner in = new Scanner(System.in);
        Main obj = new Main();
        System.out.println("Enter a number");
        num = in.nextInt();
        System.out.println("The factorials are ");
        for(int i = 1; i<=num; i++)
        {
            System.out.println("The factorial of "+i+" is "+obj.factorial(i));
        }

    }
} 
