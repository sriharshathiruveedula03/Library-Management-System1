package DsCo_1;
import java.util.*;
class nodeAns 
{
  nodeAns start=null, next, ptr, pre;
  int data;
  public void create() 
  {
    nodeAns newnode=new nodeAns();
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
    System.out.print("List: ");
    
    while(ptr!=null) 
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
  }
  public void cr_beg()
  {
    nodeAns newnode=new nodeAns();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    
    newnode.next=start;
    start=newnode;
  }
  public void cr_end()
  {
    nodeAns newnode=new nodeAns();
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
  public void cr_pos() 
  {
	  int x;
    nodeAns newnode=new nodeAns();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    x=s.nextInt();
    newnode.data=x;
    
    System.out.print("Enter position: ");
    int count=0;
    int pos;
    pos=s.nextInt();
    
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
  public void cr_mid() 
  {
    nodeAns newnode=new nodeAns();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    
    ptr=start; 
    int count=0;
    while(ptr!=null) 
    {
      count++;
      ptr=ptr.next;
    }
    System.out.println("Count: "+count);
    int mid=(count/2)+1;
    ptr=start;
    count=0;
    while(ptr!=null)
    {
      count++;
      pre=ptr;
      ptr=ptr.next;
      if(count==(mid-1)) 
      {
        pre.next=newnode;
        newnode.next=ptr;
      }
    }
  }
}
public class SingleLiskedList 
{
  public static void main(String[] args) 
  {
    nodeAns obj=new nodeAns();
    Scanner s=new Scanner(System.in);
    while(true) 
    {
      System.out.println("1. Create Linearly");
      System.out.println("2. Display");
      System.out.println("3. Create at First");
      System.out.println("4. Create at End");
      System.out.println("5. Create at a Position");
      System.out.println("6. Create at Middle");
      System.out.print("Enter your option: ");
      int op=s.nextInt();
      switch(op) 
      {
      case 1: obj.create();
      case 2: obj.display();
          break;
      case 3: obj.cr_beg();
          obj.display();
          break;
      case 4: obj.cr_end();
          obj.display();
          break;
      case 5: obj.cr_pos();
          obj.display();
          break;
      case 6: obj.cr_mid();
          obj.display();
          break;
      }
      System.out.println();
    }
  }
}