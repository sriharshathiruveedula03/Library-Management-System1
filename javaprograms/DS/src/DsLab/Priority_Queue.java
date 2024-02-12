package DsLab;
import java.util.*;
class node
{
  node ptr, start=null, pre, next;
  int data, p;
  public void create()
  {
    node newnode=new node();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    System.out.print("Enter priority: ");
    newnode.p=s.nextInt();
    if(start==null) 
    {
      start=newnode;
      newnode.next=null;
    }
    else 
    {
      if(newnode.p<start.p)
      {
        newnode.next=start;
        start=newnode;
      }
      else 
      {
        ptr=start;
        while(ptr.next!=null && ptr.next.p<newnode.p) 
        {
          ptr=ptr.next;
        }
        newnode.next=ptr.next;
        ptr.next=newnode;
      }
    }
  }
  public void display() 
  {
    ptr=start;
    while(ptr!=null)
    {
      System.out.print(ptr.data+":p("+ptr.p+")  ");
      ptr=ptr.next;
    }
  }
  public void dequeue() 
  {
    start=start.next;
  }
}
public class Priority_Queue
{
  static Scanner s=new Scanner(System.in);
  public static void main(String[] args) 
  {
    node obj=new node();
    while(true) 
    {
      System.out.println("1. Create");
      System.out.println("2. Dequeue node");
      System.out.println("3. Display");
      System.out.print("Enter your choice: ");
      int ch=s.nextInt();
      switch(ch)
      {
      case 1: obj.create();
          obj.display();
          break;
      case 2: obj.dequeue();
      case 3:  obj.display();
          break;
      }
      System.out.println();
    }
  }
}