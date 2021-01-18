//Java class having overloaded methods to calculate area of rectangle and circle
class Calculation{
    double area(double len,double br)
    {
        return (len*br);
    }
    double area(double rad)
    {
        return (3.14*rad*rad);
    }
    public static void main(String args[])
    {
        Calculation ob = new Calculation();
        System.out.println("The area of reactangle of length 5 and breadth 10 is "+ob.area(5,10));
        System.out.println("The area of circle of radius 10 is "+ob.area(10));
    }
}
