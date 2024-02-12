package Double;
import java.util.*;
class nodeA 
{
  Scanner s=new Scanner(System.in);
  nodeA ptr, preptr, start=null, next;
  int data;
  
  public void create()
  {
    nodeA newnode=new nodeA();
    System.out.print("Enter Data: ");
    newnode.data=s.nextInt();
    if(start==null)
    {
      newnode.next=null;
      start=newnode;
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
    System.out.print("Linked list: ");
    ptr=start;
    while(ptr!=null)
    {
      System.out.print(ptr.data+" ");
      ptr=ptr.next;
    }
    System.out.println();
  }
  public void createatpos() 
  {
    nodeA newnode=new nodeA();
    System.out.print("Enter Data: ");
    newnode.data=s.nextInt();
    
    if(start==null) 
    {
      start=newnode;
      newnode.next=null;
      System.out.println("Node created at 1st position as list is empty");
    }
    else 
    {
      int count=0;
      ptr=start;
      while(ptr!=null) 
      {
        count++;
        ptr=ptr.next;
      }
      System.out.print("Enter position: ");
      int pos;
      pos=s.nextInt();
      if(pos==1) 
      {
        newnode.next=start;
        start=newnode;
      }
      else if(pos>0 && pos<=(count+1)) 
      {
        int tempcount=0;
        ptr=start;
        while(ptr!=null)
        {
          tempcount++;
          preptr=ptr;
          ptr=ptr.next;
          if(tempcount==pos-1) 
          {
            preptr.next=newnode;
            newnode.next=ptr;
            break;
          }
        }
      }
      else 
      {
        System.out.println("Please enter a valid position.");
      }
    }
  }
  public void deleteatpos() 
  {
    if(start==null)
    {
      start=null;
      System.out.println("Nothing to Delete...");
    }
    else 
    {
      int count=0;
      ptr=start;
      while(ptr!=null)
      {
        count++;
        ptr=ptr.next;
      }
      System.out.print("Enter position: ");
      int pos;
      pos=s.nextInt();
      if(pos==1) 
      {
        start=start.next;
      }
      else if(pos>0 && pos<=(count+1)) 
      {
        int tempcount=0;
        ptr=start;
        while(ptr!=null)
        {
          tempcount++;
          preptr=ptr;
          ptr=ptr.next;
          if(tempcount==pos-1)
          {
            preptr.next=ptr.next;
            break;
          }
        }
      }
      else 
      {
        System.out.println("Please enter a valid position.");
      }
    }
  }
  public void reverse()
  {
    if(start==null)
    {
      System.out.println("Nothing to reverse...");
    }
    else if(start.next==null)
    {
      
    }
    else
    {
      ArrayList<Integer> arr=new ArrayList<Integer>();
      ptr=start;
      while(ptr!=null)
      {
        arr.add(ptr.data);
        ptr=ptr.next;
      }
      Collections.reverse(arr);
      for(int i=0; i<arr.size(); i++)
      {
        deletefirst();
      }
      for(int i=0; i<arr.size(); i++) 
      {
        nodeA newnode=new nodeA();
        newnode.data=arr.get(i);
        if(start==null) 
        {
          newnode.next=null;
          start=newnode;
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
  public void sort() 
  {
    if(start==null) 
    {
      System.out.println("Nothing to sort...");
    }
    else if(start.next==null) 
    {
      
    }
    else
    {
      ArrayList<Integer> arr=new ArrayList<Integer>();
      ptr=start;
      while(ptr!=null) 
      {
        arr.add(ptr.data);
        ptr=ptr.next;
      }
      Collections.sort(arr);
      for(int i=0; i<arr.size(); i++)
      {
        deletefirst();
      }
      for(int i=0; i<arr.size(); i++)
      {
        nodeA newnode=new nodeA();
        newnode.data=arr.get(i);
        if(start==null) 
        {
          newnode.next=null;
          start=newnode;
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
  public void findmax() 
  {
    if(start==null)
    {
    	System.out.println("No elements in list");
    }
    else if(start.next==null)
    {
      System.out.println("Higest value in list: "+start.data);
    }
    else 
    {
      ArrayList<Integer> arr=new ArrayList<Integer>();
      ptr=start;
      
         while(ptr!=null) 
         {
          arr.add(ptr.data);
          ptr=ptr.next;
        }
      System.out.println("Higest value in list: "+Collections.max(arr));
    }
  }
  public void findmin() 
  {
    if(start==null)
    {
      System.out.println("No elements in list");
    }
    else if(start.next==null)
    {
      System.out.println("Least value in list: "+start.data);
    }
    else 
    {
      ArrayList<Integer> arr=new ArrayList<Integer>();
      ptr=start;
      while(ptr!=null)
      {
        arr.add(ptr.data);
        ptr=ptr.next;
      }
      System.out.println("Least value in list: "+Collections.min(arr));
    }
  }
  public void count()
  {
    int count=0;
    ptr=start;
    while(ptr!=null)
    {
      count++;
      ptr=ptr.next;
    }
    System.out.print("Number of nodes are: "+count);
  }
  public void search()
  {
    if(start==null)
    {
      System.out.println("List is empty");
    }
    else 
    {
      int check=0, pos=0;
      System.out.print("Enter a value to search: ");
      int key=s.nextInt();
      ptr=start;
      
      while(ptr!=null)
      {
        pos++;
        if(key==ptr.data)
        {
          System.out.println("Element Founded at "+pos+" position.");
          check++;
          break;
        }
        ptr=ptr.next;
      }
      if(check==0)
      {
        System.out.println("Element dosent Found.");
      }
    }
  }
  public void createatfirst()
  {
    nodeA newnode=new nodeA();
    System.out.print("Enter data: ");
    newnode.data=s.nextInt();
    newnode.next=start;
    start=newnode;
  }
  public void createatlast()
  {
    nodeA newnode=new nodeA();
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
  public void createatmid()
  {
    nodeA newnode=new nodeA();
    System.out.print("Enter Data: ");
    newnode.data=s.nextInt();
    if(start==null)
    {
      start=newnode;
      newnode.next=null;
    }
    else if(start.next==null)
    {
      start.next=newnode;
      newnode.next=null;
    }
    else
    {
      int count=0, tempcount=0;
      ptr=start;
      while(ptr!=null) 
      {
        count++;
        ptr=ptr.next;
      }
      int mid=count/2;
      ptr=start;
      while(ptr.next!=null)
      {
        tempcount++;
        preptr=ptr;
        ptr=ptr.next;
        if(tempcount==mid)
        {
          preptr.next=newnode;
          newnode.next=ptr;
          break;
        }
      }
    }
  }
  public void deletefirst() 
  {
      ptr=start;
      start=start.next;
      ptr.next=null;
      ptr=null;
   }
  public void deletelast()
  {
    if(start==null)
    {
      System.out.println("Nothing to Delete...");
    }
    else if(start.next==null) 
    {
      start=null;
    }
    else 
    {
      ptr=start;
      while(ptr.next!=null)
      {
        preptr=ptr;
        ptr=ptr.next;
      }
      preptr.next=ptr.next;
      ptr.next=null;
      ptr=null;
    }
  }
  public void deleteatmid()
  {
    if(start==null)
    {
      System.out.println("Nothing to delete...");
    }
    else if(start.next==null)
    {
      start.next=null;
      start=null;
    }
    else 
    {
      int count=0, tempcount=0;
      ptr=start;
      while(ptr!=null)
      {
        count++;
        ptr=ptr.next;
      }
      int mid=count/2;
      ptr=start;
      while(ptr.next!=null) 
      {
        tempcount++;
        preptr=ptr;
        ptr=ptr.next;
        if(tempcount==(mid))
        {
          preptr.next=ptr.next;
          ptr.next=null;
          ptr=null;
          break;
        }
      }
    }
  }
}
public class Linkedlistallmethods 
{
  public static void main(String[] args) 
  {
    nodeA obj=new nodeA();
    Scanner s=new Scanner(System.in);
    
    while(true)
    {
      System.out.println("1. Create a node (Position Given Linearly)");
      System.out.println("2. Create at First");
      System.out.println("3. Create at Last");
      System.out.println("4. Create at Middle");
      System.out.println("5. Create at given Position");
      System.out.println("6. Delete First");
      System.out.println("7. Delete Last");
      System.out.println("8. Delete at Middle");
      System.out.println("9. Delete at given Position");
      System.out.println("10. Sort the List");
      System.out.println("11. Reverse the List");
      System.out.println("12. Find Biggest Value");
      System.out.println("13. Find Least Value");
      System.out.println("14. Search for a element in list");
      System.out.println("15. Exit from this Loop");
      System.out.print("Enter your option: ");
      
      int ch=s.nextInt();
      switch(ch)
      {
      case 1: obj.create();
          obj.display();
          break;
      case 2: obj.createatfirst();
          obj.display();
          break;
      case 3: obj.createatlast();
          obj.display();
          break;
      case 4: obj.createatmid();
          obj.display();
          break;
      case 5: obj.createatpos();
          obj.display();
          break;
      case 6: obj.deletefirst();
          obj.display();
          break;
      case 7: obj.deletelast();
          obj.display();
          break;
      case 8: obj.deleteatmid();
          obj.display();
          break;
      case 9: obj.deleteatpos();
          obj.display();
          break;
      case 10: obj.sort();
           obj.display();
           break;
      case 11: obj.reverse();
           obj.display();
           break;
      case 12: obj.findmax();
           break;
      case 13: obj.findmin();
           break;
      case 14: obj.search();
           break;
      case 15: System.out.println("You have exited.");
           System.exit(0);
      }
      System.out.println();
    }
  }
}
