package DsCo_1;
import java.util.*;
class Lab7
{
int front;
int rear;
int size;
int a[];
public Lab7(int n)
{
   front = rear = -1;
   size = n;
   a = new int [n];
}
public void insert(int data)
{
  if(front ==(rear+1)%size)
  System.out.println("Circular Queue is full");
  else
  {
     if(front == -1)
     front = rear = 0;
     else
     rear = (rear+1)%size;
     a[rear] = data;
  }
  System.out.println("Rear pointer: "+rear);
}
public int delete()
{
  int val;
  if(front == -1)
  {
     System.out.println("Circular Queue is empty");
     return -1;
  }
  else
  {
      val = a[front];
     if(front == rear)
     front = rear = -1;
     else
     front = (front+1)%size;
    System.out.println("Front pointer: "+front);
    return val;
  }
}
public void display()
{
  int i = front;
  while(i!=rear)
  {
     System.out.println(a[i]);
     i =( i+1)%size;
  }
  System.out.println(a[i]);
}

public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the size of the circular queue: ");
 int n = sc.nextInt();
 Lab7 obj = new Lab7(n);
 int choice=1;
 while(choice>=1 || choice<4)
 {
     System.out.println("MENU\n1. Insert\n2. Delete\n3. Display\n4. Exit\nEnter your choice: ");
     choice = sc.nextInt();
     switch(choice)
     {
         case 1: System.out.println("Enter the element to be inserted: ");
                      int x = sc.nextInt();
                      obj.insert(x);
                      break;
         case 2: System.out.println("Deleted element from the circular queue: "+obj.delete());
                      break;
         case 3: System.out.println("Displaying the circular queue: ");
                     obj.display();
                     break;
         default:
         {
             System.out.println("Exit");
             System.exit(1);
         }
      }
  }
}
}

