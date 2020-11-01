//program to check if a number is palindrome or not
import java.util.*;
class Main
{
    int reverse(int n)
    {
        int temp = n;
        int num = 0;
        while(temp != 0)
        {
            num = num * 10 + (temp % 10);
            temp = temp / 10;

        }
        return num;
    }
    int palindrome(int num,int rev)
    {
        if(num == rev)
            return 1;
        else 
            return 0;
    }
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        Main obj = new Main();
        int num;
        System.out.println("Enter a number");
        num = in.nextInt();
        int rev = obj.reverse(num);
        int result = obj.palindrome(num,rev);
        if(result == 0)
            System.out.println("The number is not Palindrome");
        else 
            System.out.println("The number is Palindrome");
    }
} 
