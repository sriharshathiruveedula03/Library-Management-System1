package DsCo_2;
import java.util.Scanner;
class Node 
{
  int size=2;
  int n;
  Node start[]=new Node[size];
  Node ptr, preptr, next;
  public void insert() 
  {
    Node newnode=new Node();
    Scanner s=new Scanner(System.in);
    System.out.println("Enter value: ");
    newnode.n=s.nextInt();
    
    int index;
    index=(newnode.n)%size;
    if(start[index]==null)
    {
      start[index]=newnode;
      newnode.next=null;
    }
    else 
    {
      ptr=start[index];
      
      while(ptr.next!=null)
      {
        ptr=ptr.next;
      }
      ptr.next=newnode;
      newnode.next=null;
    }
  }
  public void display() 
  {
    ptr=start[0];
    
    System.out.print("List 1: ");
    
    while(ptr!=null)
    {
      System.out.print(ptr.n+" ");
      ptr=ptr.next;
    }
    
    ptr=start[1];
    
    System.out.print("\nList 2: ");
    
    while(ptr!=null)
    {
      System.out.print(ptr.n+" ");
      ptr=ptr.next;
    }
  }
}
public class SeparateChaining
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    Node obj=new Node();
    
    while(true) 
    {
      System.out.println("1. Create newnode");
      System.out.println("2. Display List");
      System.out.print("Enter your choice: ");
      
      int ch=s.nextInt();
      
      switch(ch) 
      {
      case 1: obj.insert();
          obj.display();
          break;
      case 2: obj.display();
          break;
      }
      System.out.println();
    }
  }
}