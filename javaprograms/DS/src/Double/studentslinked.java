package Double;
import java.util.Scanner;
class nodeZ 
{
  nodeZ ptr, preptr, start=null, next,pre;
  String name;
  int marks;
  long id;
  public void createnewnode()
  {
    nodeZ newnode=new nodeZ();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Name: ");
    newnode.name=s.next();
    
    System.out.print("Enter Marks: ");
    newnode.marks=s.nextInt();
    
    System.out.print("Enter id: ");
    newnode.id=s.nextLong();
    
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
  public void deleteatthird()
  {
	  int count=0;
	  ptr=start;
	  while(count!=2)
	  {
		  pre=ptr;
		  ptr=ptr.next;
		  count++;
	  }
  }
  public void display()
  {
    int count=0;
    ptr=start;
    while(ptr!=null)
    {
      count++;
      System.out.println("Details of student "+count+": ");
      System.out.println("Name: "+ptr.name);
      System.out.println("Marks: "+ptr.marks);
      System.out.println("ID: "+ptr.id+"\n");
      ptr=ptr.next;
    }
  }
}
public class studentslinked
{
  public static void main(String[] args) 
  {
    nodeZ obj=new nodeZ();
    Scanner s=new Scanner(System.in);
    while(true) 
    {
      System.out.println("1. Create newnode");
      System.out.println("2. Display all nodes");
      System.out.print("Enter your choice: ");
      int ch=s.nextInt();
      switch(ch)
      {
      case 1: obj.createnewnode();
      break;
      case 2: obj.display();
      break;
      default: System.out.println("Invalid input..");
      }
      System.out.println();
    }
  }
}

