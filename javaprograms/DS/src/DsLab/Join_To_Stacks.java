package DsLab;
import java.util.*;
class Stacknode
{
  Stacknode top1=null, top2=null, ptr, pre, next;
  int data;
  public void push1() 
  {
    Stacknode newnode=new Stacknode();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    if(top1==null) 
    {
      top1=newnode;
      newnode.next=null;
    } 
    else 
    {
      newnode.next=top1;
      top1=newnode;
    }
  }
  public void push2()
  {
    Stacknode newnode=new Stacknode();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    if(top2==null)
    {
      top2=newnode;
      newnode.next=null;
    } 
    else 
    {
      newnode.next=top2;
      top2=newnode;
    }
  }
  public void pop1()
  {
     top1=top1.next;
    
  }
  public void pop2() 
  {
    
      top2=top2.next;
  }
  public void display1() 
  {
    ptr=top1;
    while(ptr!=null) 
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
  }
  public void display2() 
  {
    ptr=top2;
    while(ptr!=null)
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
  }
  public void join()
  {
    ptr=top1;
    
    while(ptr.next!=null) 
    {
      ptr=ptr.next;
    }
    ptr.next=top2;
  }
}
public class  Join_To_Stacks
{

  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    Stacknode obj=new Stacknode();
    while(true) 
    {
      System.out.println("1. Create newnode in Stack 1");
      System.out.println("2. Create newnode in Stack 2");
      System.out.println("3. Display Stack 1");
      System.out.println("4. Display Stack 2");
      System.out.println("5. Join Stack1, Stack2");
      System.out.print("Enter your choice: ");
      int ch=s.nextInt();
      switch(ch)
      {
      case 1: obj.push1();
          obj.display1();
          break;
      case 2: obj.push2();
          obj.display2();
          break;
      case 3: obj.display1();
          break;
      case 4: obj.display2();
          break;
      case 5: obj.join();
      System.out.println("Stack 2 Joined to Stack 1");
          obj.display1();
          break;
      }
      System.out.println();
    }
  }
}