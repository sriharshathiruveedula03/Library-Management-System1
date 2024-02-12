package DsCo_1;
import java.util.*;
class nodeX
{
  nodeX ptr, preptr, start=null, next;
  int data;
  public void createnewnode()
  {
    nodeX newnode=new nodeX();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    
    if(start==null)
    {
      start=newnode;
      newnode.next=start;
    }
    else
    {
      ptr=start;
      while(ptr.next!=start)
      {
        ptr=ptr.next;
      }
      ptr.next=newnode;
      newnode.next=start;
    }
  }
  public void display()
  {
    ptr=start;
    
    System.out.print("Linked list: ");
    
    while(ptr.next!=start) 
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
    System.out.println(ptr.data);
  }
  public void deletelast()
  {
    ptr=start;
    while(ptr.next!=start)
    {
      preptr=ptr;
      ptr=ptr.next;
    }
    preptr.next=ptr.next;
    ptr.next=null;
    ptr=null;
  }
  public void deletefirst() 
  {
    ptr=start;
    while(ptr.next!=start)
    {
      ptr=ptr.next;
    }
    ptr.next=start.next;
    start=start.next;
  }
  public void deleteatpos() 
  {
    int nodecount=0, pos;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter position to delete: ");
    pos=s.nextInt();
    ptr=start;
    while(ptr.next!=start)
    {
      nodecount++;
      preptr=ptr;
      ptr=ptr.next;
      if(nodecount==(pos-1)) 
      {
        preptr.next=ptr.next;
        ptr.next=null;
        ptr=null;
        break;
      }
    }
  }
  public void createatlast()
  {
    nodeX newnode=new nodeX();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    
    while(ptr.next!=start)
    {
      ptr=ptr.next;
    }
    ptr.next=newnode;
    newnode.next=start;
  }
  public void createatfirst() 
  {
    nodeX newnode=new nodeX();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    
    while(ptr.next!=start) 
    {
      ptr=ptr.next;
    }
    ptr.next=newnode;
    newnode.next=start;
    start=newnode;
  }
  public void createatgivenpos() 
  {
    int pos,nodecount=0;
    nodeX newnode=new nodeX();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    System.out.print("Enter position to insert: ");
    pos=s.nextInt();
    
    ptr=start;
    while(ptr.next!=start) 
    {
      nodecount++;
      preptr=ptr;
      ptr=ptr.next;
      if(nodecount==(pos-1))
      {
        preptr.next=newnode;
        newnode.next=ptr;
        break;
      }
    }
  }
}
public class Circular_SingleLinkedList 
{
  public static void main(String[] args)
  {
    nodeX obj=new nodeX();
    Scanner s=new Scanner(System.in);    
    while (true) {
      System.out.println("1. Create a new node(Position given Linearly)");
      System.out.println("2. Create a new node at First");
      System.out.println("3. Create a new node at Last");
      System.out.println("4. Delete First node");
      System.out.println("5. Delete Last node");
      System.out.println("6. Delete a node at a position");
      System.out.println("7. Create a node at a position");
      System.out.println("8. Display all nodes");
      System.out.println("9. Exit this loop");
      System.out.print("Enter Your Choise: ");
      int choise=s.nextInt();
      
      switch(choise)
      {
        case 1: obj.createnewnode();
            obj.display();
            break;
        case 2: obj.createatfirst();
            obj.display();
            break;
        case 3: obj.createatlast();
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
        case 7: obj.createatgivenpos();
            obj.display();
            break;
        case 8: obj.display();
            break;
        case 9: System.exit(0);
        default: System.out.println("Invalid Choice.");
      }
      System.out.println();
    }
  }
}
