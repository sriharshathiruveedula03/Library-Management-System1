package DsCo_1;
import java.util.*;
class CQ 
{
	  int front=-1, rear=-1;
	  int size=5;
	  int[] q=new int[size];
	  public void enqueue() 
	  {
	      Scanner s=new Scanner(System.in);
	      System.out.print("Enter Data: ");
	      int value;
	      value=s.nextInt();
	      
	      if(front==-1 && rear==-1) 
	      {
	        front=0;
	        rear=0;
	        q[rear]=value;
	      }
	      else if(front!=0 && rear==size-1)
	      {
	        rear=0;
	        q[rear]=value;
	      }
	      else 
	      {
	        rear++;
	        q[rear]=value;
	      }
	    }
	  
	  public void dequeue()
	  {
	      if(front==rear) 
	      { 
	    	  // Only one element is there
	        front=-1;
	        rear=-1;
	      }
	      else if(front==size-1) 
	      {
	        front=0;
	      }
	      else 
	      {
	        front++;
	      }
	    }
	  
	  public void display()
	  {
	    
	      if(front <= rear) 
	      {
	        for(int i=front; i<=rear; i++) 
	        {
	          System.out.print(q[i]+" ");
	        }
	      }
	      else
	      {
	        for(int i=front; i<=size-1; i++)
	        {
	          System.out.print(q[i]+" ");
	        }
	        for(int i=0; i<=rear; i++) 
	        {
	          System.out.print(q[i]+" ");
	        }
	      }
	    }
	  
}
public class CircularQueue
{
		public static void main(String[] args)
		{
			CQ  o=new CQ();
			Scanner s=new Scanner(System.in);
			
			while(true)
			{
				System.out.println("1. Enqueue");
				System.out.println("2. Dequeue");
				System.out.println("3. Display");
				System.out.print("Enter your choice: ");
				
				int ch=s.nextInt();
				switch(ch) 
				{
				case 1: o.enqueue();
	            o.display();
	            break;
				case 2: o.dequeue();
	            o.display();
	            break;
				case 3: o.display();
	            break;
				default: System.out.println("Invalid input..");
				}
				System.out.println();
			}
		}
		
}
