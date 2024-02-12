package DsCo_1;
import java.util.Scanner;
class St
{	
  St next, top=null, ptr, preptr;
  String name;
  String book;
  long id;
  public void create()
  {
	  long t;
	  String X;
    Scanner s=new Scanner(System.in);
    St newnode=new St();
    
    System.out.print("Enter Name: ");
    X=s.next();
    newnode.name=X;
    
    System.out.print("Enter book name: ");
    X=s.next();
    newnode.book=X;
    
    System.out.print("Enter ID: ");
    t=s.nextLong();
    newnode.id=t;
    
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
  	public void display()
  	{
  		ptr=top;
  		while(ptr!=null)
  		{
  			System.out.println(ptr.name+" ");
  			System.out.println(ptr.book+" "); 
  			System.out.println(ptr.id+" "); 
  			ptr=ptr.next;
  		}
  	}
  	public static class StackDetails
  	{
  		public static void main(String[] args)
  		{
  			St obj=new St();
  			Scanner s=new Scanner(System.in);
  			while(true)
  			{
  				System.out.println("1. Create newnode");
  				System.out.println("2. Display List");
  				System.out.print("Enter your choice: ");
  				int ch=s.nextInt();
  				switch(ch)
  				{
  					case 1: obj.create();
  					break;
  					case 2: obj.display();
  					break;
  				}
  			}
  		}
  	}
}