package Double;
import java.util.*;
class nodeW 
{
  nodeW ptr, preptr, next, start=null;
  int data;
  public void createnewnode()
  {
    nodeW newnode=new nodeW();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
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
  public void display()
  {
    ptr=start;
    System.out.print("Linked List is: ");
    while(ptr!=null) 
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
    System.out.print("\n");
  }
  public void displayreverse() 
  {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    ptr=start;
    System.out.print("Linked List in reverse order is: ");
    while(ptr!=null) 
    {
      arr.add(ptr.data);
      ptr=ptr.next;
    }
    Collections.reverse(arr);
    for(int x=0; x<arr.size(); x++) 
    {
      System.out.print(arr.get(x)+" ");
    }
  }
  public void createatbeg()
  {
    nodeW newnode=new nodeW();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    newnode.next=start;
    start=newnode;
  }
  public void createatlast() 
  {
    nodeW newnode=new nodeW();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    ptr=start;
    while(ptr.next!=null)
    {
      ptr=ptr.next;
    }
    ptr.next=newnode;
    newnode.next=null;
  }
  public void createatgivenpos()
  {
    int pos,nodecount=0;
    nodeW newnode=new nodeW();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    System.out.print("Enter position to insert: ");
    pos=s.nextInt();
    
    ptr=start;
    while(ptr.next!=null) 
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
  public void deletefirst() 
  {
    ptr=start;
    start=ptr.next;
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
    ptr=null;
  }
  public void deleteatpos() 
  {
    int nodecount=0,pos;
    ptr=start;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter position to delete: ");
    pos=s.nextInt();
    while(ptr.next!=null)
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
}
public class SLL
{
  public static void main(String[] args)
  {
    nodeW obj=new nodeW();
    Scanner s=new Scanner(System.in);    
    while (true)
    {
      System.out.println("1. Create a new node(Position given Linearly)");
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
        case 2: obj.createatbeg();
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
      }
    }
  }

}
