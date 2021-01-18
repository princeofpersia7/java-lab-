//Class with a method that prints "This is parent class" and its subclass with 
//another method that prints "This is child class". Now, create an object for each of the class and call
//   method of parent class by object of parent class
//   method of child class by object of child class
//   method of parent class by object of child class

public class Main
{
    public static void main(String args[])
    {
        Parent ob = new Parent();
        child ob1 = new child();
        ob.methord();
        ob1.methord1();
        ob1.methord();
    }
}
class Parent
{
    void methord()
    {
        System.out.println("This is parent class");
    }
}
class child extends Parent
{
    void methord1()
    {
         System.out.println("This is child class");
    }
}
