package Double;
import java.util.Scanner;
class DLLnode 
{
  DLLnode  start=null, ptr, next, prev, preptr;
  String name;
  int price;
  public void create()
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter Name: ");
    DLLnode newnode=new DLLnode();
    newnode.name=s.next();
    
    System.out.print("Enter Price: ");
    newnode.price=s.nextInt();
    if(start==null) 
    {
      newnode.next=null;
      start=newnode;
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
    while(ptr.next!=null) 
    {
      ptr=ptr.next;
    }
    while(ptr!=null)
    {
      System.out.println(ptr.name+" ");
      System.out.println(ptr.price+" ");
      ptr=ptr.prev;
    }
  }  
}
public class doublelinkedStudent
{
  public static void main(String[] args)
  {
    DLLnode n=new DLLnode();
    n.create();
    n.create();
    n.create();
    n.display();
  }
}