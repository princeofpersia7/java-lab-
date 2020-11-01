//program to check if a number is palindrome or not
import java.util.*;
class Main
{
    void armstrong(int num)
    {
        int sum =  0;
        int n,temp = num;
        while(temp != 0)
        {
            n = temp % 10;
            sum += (n*n*n);
            temp = temp / 10;
        }
        if(sum == num)
            System.out.println("The number is Armstrong number");
        else 
            System.out.println("The number is not Armstrong");
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Main obj = new Main();
        int num;
        System.out.println("Enter a three digit number");
        num = in.nextInt();
        obj.armstrong(num);
    }
} 
