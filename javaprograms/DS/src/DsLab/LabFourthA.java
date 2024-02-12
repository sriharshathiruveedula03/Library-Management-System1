package DsLab;
import java.util.*;
class DLLnode 
{
	  DLLnode start=null, ptr, prev,preptr, next;
	  int data;
	  public void create()
	  {
	    DLLnode newnode=new DLLnode();
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter data: ");
	    newnode.data=s.nextInt();
	    
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
	      newnode.next=null;
	      newnode.prev=ptr;
	    }
	  }
	  public void display()
	  {
	    ptr=start;
	    System.out.print("List: ");
	    while(ptr!=null)
	    {
	      System.out.print(ptr.data+" ");
	      ptr=ptr.next;
	    }
	  }
	  
	  public void displayinrev()
	  {
	    ptr=start;
	    System.out.print("List: ");
	    
	    while(ptr.next!=null)
	    {	
	      ptr=ptr.next;
	    }
	    while(ptr!=null)
	    {
	      System.out.print(ptr.data+" ");
	      ptr=ptr.prev;
	    }
	  }
	  public void insertatpos() 
	  {
	    Scanner s=new Scanner(System.in);
	    DLLnode newnode=new DLLnode();
	    System.out.print("Enter data: ");
	    newnode.data=s.nextInt();
	    
	    int count=0;
	    System.out.print("Enter position to insert: ");
	    int pos=s.nextInt();
	    
	    ptr=start;
	    while(ptr!=null)
	    {
	      count++;
	      preptr=ptr;
	      ptr=ptr.next;
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
public class LabFourthA
{
	public static void main(String[] args)
	{
		DLLnode obj=new DLLnode();
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
	        case 2: obj.insertatpos();
	            obj.display();
	            break;
	        case 3: obj.display();
	            break;
	        case 4: obj.displayinrev();
	            break;
	        case 5: System.exit(0);
	        default: System.out.println("Invalid Choice.");
	      }
	      System.out.println();
	    }
	  }
}

