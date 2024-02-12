/*Java program for STACK using linked list with push, pop, display.....*/
package DsCo_1;
import java.util.*;
class Stack
{
	int n;
	Stack top=null,ptr,pre,next;
	public void push()
	{
		int x;
		Stack newnode=new  Stack();
		Scanner k=new Scanner(System.in);
		System.out.println("enter value");
		x=k.nextInt();
		newnode.n=x;
		
		if(top==null)
		{
			top=newnode;
			newnode.next=null;
		}
		else
		{
			newnode.next=top;
			top=newnode;
		}
	}
	public void pop()
	{
		Stack newnode=new Stack();
		ptr=top;
		top=top.next;
		ptr.next=null;
		ptr=null;
	}
	public void display()
	{
		ptr=top;
		while(ptr!=null)
		{
			System.out.println(ptr.n);
			ptr=ptr.next;
		}
	}
	public void displaypeak()
	{
	    if(top==null)
	    {
	      System.out.println("Stack is Empty");
	    }
	    else 
	      System.out.println("Top element: "+top.n);
	  }
}
public class  StackUsingLinkedList
{
	public static void main(String args[])
    {
		Stack z=new  Stack();
			while(true)
			{
				Scanner k=new Scanner(System.in);
				System.out.println("1.push");
				System.out.println("2.pop");
				System.out.println("3.peek element");
				System.out.println("4.display");
				System.out.println("Enter your choice: ");
				
				int ch;
				ch=k.nextInt();
				
				switch(ch)
				{
				case 1:z.push();
	            break;
				case 2: z.pop();
	            break;
				case 3: z.displaypeak();
	        	break;
				case 4: z.display();
				break;
		        default: System.out.println("Invalid Choice.");
		     }
		       System.out.println();
			}	
    }	
}