//Define a class Queue for representing a queue data structure.
//The class must define a default constructor, a parameterized constructor and functions for enqueue, dequeue and display operations.
//Write a Java program to implement this.
import java.util.*;


public class Main
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the length of Queue");
        int len = in.nextInt();
        Queue ob = new Queue(len);
        do
        {
            int option;
            System.out.println("Enter option \n1.Enqueue \n2.Dequeue \n3.Display \n4.Exit");
            option = in.nextInt();
            switch(option)
            {
                case 1:
                    System.out.println("Enter data");
                    int data = in.nextInt();
                    ob.enqueue(data);
                    break;
                
                case 2:
                    ob.dequeue();
                    break;

                case 3:
                    System.out.println("The queue is ");
                    ob.display();
                    break;
                
                case 4:
                    return;
                
                default :
                    System.out.println("Enter valid option");

            }

        }while(true);
    }
    

}


class Queue
{
    int length;
    int rear;
    int front;
    int queue[];
    Queue()
    {
        length = 10;
        queue = new int[length];
    }
    Queue(int len)
    {
        length = len;
        queue = new int[length];
        rear = -1;
        front = -1;
    }
    void enqueue(int data)
    {
        if(rear == length -1)
            System.out.println("Queue is full cannot add data");
        else if(front == -1 && rear == -1)
        {
            front = rear = 0;
            queue[rear] = data;
        }
        else
        {
            rear = rear + 1;
            queue[rear] = data;
        }
    }
    void dequeue()
    {
        if(front == -1 && rear == -1)
            System.out.println("The queue is empty");
        else if(front == rear)
        {
            System.out.println("The element to be popped is");
            System.out.println(queue[front]);
            front = rear = -1;
        }
        else
        {
            System.out.println("The element to be popped is");
            System.out.println(queue[front]);
            front = front + 1;
        }
    }
    void display()
    {
        int  i = front;
        if(front == -1 && rear == -1)
            System.out.println("Queue is empty");
        else
        {
            for(i = front;i<rear+1;i++)
            {
                System.out.print(queue[i]+" ");
            }
            System.out.println();
        }
    }
}
