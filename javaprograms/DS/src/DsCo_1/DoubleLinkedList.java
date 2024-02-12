package DsCo_1;
import java.util.*;
class nodeY 
{
  nodeY start=null, ptr, prev, next, preptr;
  int data;
  public void createnewnode()
  {
    nodeY newnode=new nodeY();
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
      newnode.prev=start;
      newnode.next=null;
    }
  }
  public void insertatfirst()
  {
    nodeY newnode=new nodeY();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    
    
    newnode.next=start;
    newnode.prev=null;
    start.prev=newnode;
    start=newnode;
  }
  public void insertatlast() 
  {
    nodeY newnode=new nodeY();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    
    ptr=start;
    while(ptr.next!=null) 
    {
      ptr=ptr.next;
    }
    ptr.next=newnode;
    newnode.prev=ptr;
    newnode.next=null;
  }
  public void deletefirst()
  {
    ptr=start;
    start=start.next;
    start.prev=null;
    ptr.next=null;
    ptr=null;
  }
  public void deletelast() 
  {
    ptr=start;
    while(ptr.next!=null)
    {
      preptr=ptr;
      ptr=ptr.next;
    }
    preptr.next=null;
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
    
    System.out.print("List in reverse: ");
    
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
    int count=0;
    nodeY newnode=new nodeY();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    System.out.print("Enter position: ");
    int pos=s.nextInt();
    
    ptr=start;
    while(ptr.next!=null)
    {
      count++;
      preptr=ptr;
      ptr=ptr.next;
      if(count==(pos-1))
      {
        preptr.next=newnode;
        newnode.next=ptr;
        newnode.next=ptr;
        newnode.prev=preptr;
        break;
      }
    }
  }
  public void deleteatpos() 
  {
    int pos, count=0;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter position: ");
    pos=s.nextInt();
    
    ptr=start;
    while(ptr.next!=null) 
    {
      count++;
      preptr=ptr;
      ptr=ptr.next;
      if(count==(pos-1))
      {
        preptr.next=ptr.next;
        ptr.next.prev=preptr;
        ptr.next=null;
        ptr.prev=null;
        ptr=null;
        break;
      }
    }
  }
}
public class DoubleLinkedList
{
  public static void main(String[] args) 
  {
    nodeY obj=new nodeY();
    Scanner s=new Scanner(System.in);    
    while (true)
    {
      System.out.println("1. Create a new node");
      System.out.println("2. Create a new node at First");
      System.out.println("3. Create a new node at Last");
      System.out.println("4. Delete First node");
      System.out.println("5. Delete Last node");
      System.out.println("6. Delete a node at a position");
      System.out.println("7. Create a node at a position");
      System.out.println("8. Display all nodes");
      System.out.println("9. Display elements in reverse order");
      System.out.println("10. Exit this loop");
      System.out.print("Enter Your Choise: ");
      int choise=s.nextInt();
      
      switch(choise) 
      {
        case 1: obj.createnewnode();
            obj.display();
            break;
        case 2: obj.insertatfirst();
            obj.display();
            break;
        case 3: obj.insertatlast();
            obj.display();
            break;
        case 4: obj.deletefirst();
            obj.display();
            break;
        case 5: obj.deletelast();
            obj.display();
            break;
        case 6: obj.deleteatpos();
            obj.display();
            break;
        case 7: obj.insertatpos();
            break;
        case 8: obj.display();
            break;
        case 9: obj.displayinrev();
            break;
        case 10: System.exit(0);
        default: System.out.println("Invalid Choice.");
      }
      System.out.println();
    }
  }
}

