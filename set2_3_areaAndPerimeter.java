//Program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
//by creating a class named 'Triangle' without any parameter in its constructor.
class Triangle
{
    int length;
    int breadth;
    int height;
    double perimeter;
    double area;
    double s;
    Triangle()
    {
        length = 3;
        breadth = 4;
        height = 5;
        perimeter = calPerimeter();
        s = perimeter / 2;
        area = calArea();
    }
    double calPerimeter()
    {
        return length+breadth+height;
    }
    double calArea()
    {
        return Math.sqrt((s)*(s-length)*(s-breadth)*(s-height));

    }
    public static void main(String args[])
    {
        Triangle ob = new Triangle();
        System.out.println("The area of Triangle is "+ob.area);
        System.out.println("The perimeter of Triangle is "+ob.perimeter);
    }
} 
