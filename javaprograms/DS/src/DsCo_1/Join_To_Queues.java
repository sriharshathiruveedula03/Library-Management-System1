package DsCo_1;
import java.util.*;
class queuenodeB 
{
  queuenodeB front1=null, rear1=null, front2=null, rear2=null, ptr, next;
  int data;
  public void enqueuQ1()
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    queuenodeB newnode=new queuenodeB();
    newnode.data=s.nextInt();
    
    if(front1==null)
    {
      front1=newnode;
      rear1=newnode;
      newnode.next=null;
    }
    else
    {
      rear1.next=newnode;
      rear1=newnode;
      newnode.next=null;  
    }
  }
  public void enqueuQ2()
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter data: ");
    queuenodeB newnode=new queuenodeB();
    newnode.data=s.nextInt();
    
    if(front2==null)
    {
      front2=newnode;
      rear2=newnode;
      newnode.next=null;
    }
    else
    {
      rear2.next=newnode;
      rear2=newnode;
      newnode.next=null;  
    }
  }
  public void dequeueQ1() 
  {
    front1=front1.next;
  }
  public void dequeueQ2()
  {
    front2=front2.next;
  }
  public void mergeQ1Q2()
  {
    rear1.next=front2;
  }
  public void displayQ1()
  {
    ptr=front1;
    System.out.print("Queue 1: ");
    
    while(ptr!=null) 
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
  }
  public void displayQ2()
  {
    ptr=front2;
    System.out.print("Queue 2: ");
    
    while(ptr!=null)
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
  }
}
public class Join_To_Queues 
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    queuenodeB obj=new queuenodeB();
    
    while(true)
    {
      System.out.println("1. Enqueue queue 1");
      System.out.println("2. Enqueue queue 2");
      System.out.println("3. Dequeue queue 1");
      System.out.println("4. Dequeue queue 2");
      System.out.println("5. Display queue 1");
      System.out.println("6. Display queue 2");
      System.out.println("7. Join 2nd queue to 1st queue");
      System.out.print("Enter your choice: ");
      
      int ch=s.nextInt();
      
      switch(ch) 
      {
      case 1: obj.enqueuQ1();
          obj.displayQ1();
          break;
      case 2: obj.enqueuQ2();
          obj.displayQ2();
          break;
      case 3: obj.dequeueQ1();
          obj.displayQ1();
          break;
      case 4: obj.dequeueQ2();
          obj.displayQ2();
          break;
      case 5: obj.displayQ1();
          break;
      case 6: obj.displayQ2();
          break;
      case 7: obj.mergeQ1Q2();
          System.out.println("Queue 2 Joined to Queue 1");
          obj.displayQ1();
          break;
      }
      System.out.println();
    }
  }
}

