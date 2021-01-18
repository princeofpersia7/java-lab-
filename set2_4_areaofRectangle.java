//Program to print the area of a rectangle by creating a class named 'Area' taking 
//the values of its length and breadth as parameters of its constructor and 
//having a method named 'returnArea' which returns the area of the rectangle. 
//Length and breadth of rectangle are entered through keyboard.

import java.util.*;

class Area
{
    int length;
    int breadth;
    int area;
    Area(int l,int b)
    {
        length = l;
        breadth = b;
        area = returnArea();
    }
    int returnArea()
    {
        return length * breadth;
    }
    public static void main(String args[])
    {
        int l,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        l = in.nextInt();
        System.out.println("Enter the breadth of rectangle");
        b = in.nextInt();
        Area ob = new Area(l,b);
        System.out.println("The area of the rectangle is "+ob.area);
    }
}