//program to check if a number is prime or not
import java.util.*;
class prime
{
    public static void main(String args[])
    {
        int num;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a  number");
        num = in.nextInt();
        int counter = 1;

        for(int i = 2;i<num;i++)
        {
            if(num%i == 0)
            {
                counter = 0;
                break;
            }
        }

        if(counter == 0)
            System.out.println("The number is not Prime");
        else
            System.out.println("The number is Prime");
    }
} 
