package sri;
import java.util.Scanner;
class doublee
{
	int n;
	doublee start=null,ptr,prev,preptr,next;
	public void create()
	{
		int x;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data");
		doublee newnode=new doublee();
		x=s.nextInt();
		newnode.n=x;
		
		if(start==null)
		{
			start=newnode;
			newnode.next=null;
			newnode.prev=null;
			
		}
		else
		{
			ptr=start;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=newnode;
			newnode.prev=ptr;
			newnode.next=null;
		}
	}
	public void display()
	{
		ptr=start;
		while(ptr!=null)
		{
			System.out.println(ptr.n+" ");
			ptr=ptr.next;	
		}	
	}
	public void displayinrever()
	{
		ptr=start;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		while(ptr!=null)
		{
			System.out.println(ptr.n+" ");
			ptr=ptr.prev;
		}
	}
	public void indertAtpostion()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter data");
		doublee newnode=new doublee();
		newnode.n=s.nextInt();
		int count=0;
		System.out.println("Enter position to insert:");
		int pos;
		pos=s.nextInt();
		
		ptr=start;
		while(ptr!=null)
		{
			count++;
			ptr=ptr.next;
			preptr=ptr;
			if(count==(pos-1))
			{
				preptr.next=newnode;
				newnode.next=ptr;
				newnode.prev=preptr;
				ptr.prev=newnode;
				break;
			}
		}
	}
}
public class prac 
{
	public static void main(String[] args) 
	{
		doublee  obj=new  doublee();
	    Scanner s=new Scanner(System.in);  
	    while (true) 
	    {	
	      System.out.println("1. Create a new node");
	      System.out.println("2. Create a new node at Given position");
	      System.out.println("3. Display all nodes");
	      System.out.println("4. Display all nodes in reverse");
	      System.out.println("5. Exit this loop");
	      System.out.print("Enter Your Choise: ");
	      
	      int choise=s.nextInt();
	      switch(choise) 
	      {
	        case 1: obj.create();
	            obj.display();
	            break;
	        case 2: obj.indertAtpostion();
	            obj.display();
	            break;
	        case 3: obj.display();
	            break;
	        case 4: obj.displayinrever();
	            break;
	        case 5: System.exit(0);
	        default: System.out.println("Invalid Choice.");
	      }
	      System.out.println();
}
}
}
