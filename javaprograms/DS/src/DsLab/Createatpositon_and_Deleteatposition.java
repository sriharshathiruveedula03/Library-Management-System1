package DsLab;
import java.util.Scanner;
class nodeAnsN 
{
  nodeAnsN start=null, next, ptr, pre,preptr;
  int n;
  public void create() 
  {
    nodeAnsN newnode=new nodeAnsN();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.n=s.nextInt();
   
    if(start==null)
    {
      start=newnode;
      newnode.next=null;
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
    }
  }
  public void createAtAnyposition() 
  {
	 
    nodeAnsN newnode=new nodeAnsN();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.n=s.nextInt();
    
    
    int count=0;
    int pos;
    pos=s.nextInt();
    System.out.print("Enter position: ");
    
    ptr=start;
    
    while(ptr!=null)
    {
      count++;
      pre=ptr;
      ptr=ptr.next;
      if(count==(pos-1))
      {
        pre.next=newnode;
        newnode.next=ptr;
      }
    }
  }
  
  public void deleteAtAnyposition()
  {
	  Scanner s=new Scanner(System.in);
	  System.out.println("Enter position: ");
	  int count=0, pos=s.nextInt();
	  ptr=start;
	  while(ptr!=null)
	  {
		  count++;
		  pre=ptr;
		  ptr=ptr.next;
		  if(count==pos-1)
		  {
			  pre.next=ptr.next;
		  }
	  }
  }
  public void display()
  {
    ptr=start;
    System.out.print("List: ");
    
    while(ptr!=null) 
    {
      System.out.print(ptr.n+" ");
      ptr=ptr.next;
    }
  }
public class Createatpositon_and_Deleteatposition 
{

	public void main(String[] args)
	{
		nodeAnsN obj=new nodeAnsN();
	    Scanner s=new Scanner(System.in);
	    while(true) 
	    {
	      System.out.println("1. Create Linearly");
	      System.out.println("2. Display");
	      System.out.println("3. Create at any Position");
	      System.out.println("4. Delete at any position");
	      System.out.print("Enter your option: ");
	      int op=s.nextInt();
	      switch(op) 
	      {
	      case 1: obj.create();
	      		break;
	      case 2: obj.display();
	      		break;
	      case 3: obj.createAtAnyposition();
	          obj.display();
	          break;
	      case 4: obj.deleteAtAnyposition();
	      		obj.display();
	      		break;
	      }
	      System.out.println();
	    }
	}
 }
}