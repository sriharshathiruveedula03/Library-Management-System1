package DsLab;
import java.util.*;
class nodeB
{
  nodeB ptr, pre, start=null, next;
  int data;
  public void create()
  {
    nodeB newnode=new nodeB();
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
    while(ptr!=null)
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
  }
  public void arrangeinreverse() 
  {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    ptr=start;
    while(ptr!=null)
    {
      arr.add(ptr.data);
      ptr=ptr.next;
    }
    start=null;
    Collections.reverse(arr);
    
    for(int i=0; i<arr.size(); i++) 
    {
      nodeB newnode=new nodeB();
      newnode.data=arr.get(i);
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
  }
}
public class Reverse
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    nodeB obj=new nodeB();
    while(true) 
    {
      System.out.println("1. Create");
      System.out.println("2. Display");
      System.out.println("3. Re-arrange elements in reverse order");
      System.out.print("Enter your option: ");
      int op=s.nextInt();
      switch(op) 
      {
      case 1: obj.create();
      case 2: obj.display();
          break;
      case 3: obj.arrangeinreverse();
          obj.display();
          break;
      }
      System.out.println();
    }
  }
}
