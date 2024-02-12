package DsLab;
import java.util.*;

class nodeF
{
  nodeF ptr, start=null, next, pre;
  int data;
  public void create() 
  {
    nodeF newnode=new nodeF();
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
  public void sort()
  {
    ArrayList<Integer> arr=new ArrayList<Integer>();
    ptr=start;
    while(ptr!=null) 
    {
      arr.add(ptr.data);
      ptr=ptr.next;
    }
    Collections.sort(arr);
    start=null;
    for(int i=0; i<arr.size(); i++) 
    {
      nodeF newnode=new nodeF();
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
public class Sort
{

  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    nodeF obj=new nodeF();
    while(true) 
    {
      System.out.println("1. Create");
      System.out.println("2. Display");
      System.out.println("3. Re-arrange elements in sorted order");
      System.out.print("Enter your option: ");
      int op=s.nextInt();
      switch(op) 
      {
      case 1: obj.create();
      case 2: obj.display();
          break;
      case 3: obj.sort();
          obj.display();
          break;
      }
      System.out.println();
    }
  }
}

