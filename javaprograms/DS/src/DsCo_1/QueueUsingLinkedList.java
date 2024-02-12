package DsCo_1;
import java.util.*;
class Queue
{
	int n;
	Queue front=null,rear=null,ptr,next;
	public void enque()
	{
		Queue newnode=new Queue();
		System.out.println("enter value");
		Scanner k=new Scanner(System.in);
		newnode.n=k.nextInt();
  
		if(front==null && rear==null)
		{
			front=newnode;
			rear=newnode;
			rear.next=null;
		}
		else
		{
			rear.next=newnode;
			rear=newnode;
			newnode.next=null;
		}
	}
	public void dequeue()
	{
		ptr=front;
		front=front.next;
		ptr.next=null;
		ptr=null;
	}
 	public void display()
 	{
	  ptr=front;
	  while(ptr!=null)
	  {
		 System.out.println(ptr.n);
		 ptr=ptr.next;
	  }
 	}
}
public class  QueueUsingLinkedList
{
	public static void main(String[] args)
	{
		int ch;
		Queue z=new Queue();
  		Scanner k=new Scanner(System.in);
  		
  		while(true)
      	{
      		System.out.println("1.enque");
      		System.out.println("2.dequeue");
      		System.out.println("3.display");
      		System.out.println("4. Exit this loop");
      		System.out.print("Enter Your Choise: "); 
      		ch=k.nextInt();
      		switch(ch)
      		{
      		case 1:z.enque(); 
      		break;
      		case 2:z.dequeue();
      		break;
      		case 3:z.display();
      		break;
      		case 4: System.exit(0);
            default: System.out.println("Invalid Choice.");
      	
      		}
  		System.out.println();
      	}
  	
	}
}

