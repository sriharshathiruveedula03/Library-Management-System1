package LAB1;
import java.util.Scanner;
class task1 extends Thread 
{
  int num;
  public void method2(int num)
  {
    this.num=num;
  }
  public void run()
  {
    int div=0;
    while(num>0)
    {
      div=0;
      for (int i=1; i<=num; i++)
      {
        if(num%i==0) 
        {
          div++;
        }
      }
      if( div==2 )
      {
        System.out.println("Prime Number - "+num);
      }
      num--;
    }
  }
}
class task2 extends task1 
{
  int num;
  public void method2(int num) 
  {
    this.num=num;
  }
  public void run()
  {
    int div=0;
    while(num>0)
    {
      div=0;
      for (int i=1; i<=num; i++) 
      {
        if(num%i==0)
        {
          div++;
        }
      }
      if ( div!=2 && num!=1 ) 
      {
        System.out.println("Composite Number - "+num);
      }
      num--;
    }
  }
}
public class Lab11B 
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num=s.nextInt();
    
    System.out.println("Prime and composite numbers before "+num+":");
    task1 t1=new task1();
    task2 t2=new task2();
    
    t1.method2(num);
    t2.method2(num);
    
    t1.start();
    t2.start();
    
    s.close();
  }
}
