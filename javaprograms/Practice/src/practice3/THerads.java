package practice3;
/*
class task99 extends Thread
{
	  public void run()
	  {
	    System.out.println(Thread.currentThread().getName());  //returns name of the thread
	  }
}
class task99_2 extends task99
{
	  public void run()
	  {
	    System.out.println(Thread.currentThread().getName());  //returns name of the thread
	  }
}
public class THerads
{

	public static void main(String[] args)
	{
		task99 t99=new task99();

	    t99.start();   // in thread start == run

	    task99_2 t99_2=new task99_2();

	    t99_2.start();

	  }
}

class dop extends Thread
{
	// implements Runnable
   public void run()
  {
    for(int i=1;i<=5;i++)
     {
	   System.out.println(i+" -- "+Thread.currentThread().getName());
	 }
  }

}
class edos2 extends dop
{
	public void run()
	 {
	   for(int i=1;i<=5;i++)
	    {
	      System.out.println(i+" -- "+Thread.currentThread().getName());
	    }
	 }
}
public class THerads
{
	public static void main(String[] args)
	{
	    dop o=new dop();
	    edos2 o1=new edos2();

	    o.start();
	    o1.start();
	  }
}*/

import java.util.*;
public class THerads
{
  public static void main(String[] args)
  {

    ArrayList<Integer> a=new ArrayList<Integer>();
    Scanner s=new Scanner(System.in);

    int sal , n;
    System.out.print("Enter no.of values to be stored: ");
    n=s.nextInt();

    for(int i=1;i<=n;i++)
    {
      System.out.print("Enter value "+(i)+": ");
      sal=s.nextInt();
      a.add(sal); // stores value of "sal" at least possible index
    }

    System.out.println("Initial array: "+a);
    System.out.println("Max: "+Collections.max(a));
    System.out.println("Min: "+Collections.min(a));

    Collections.sort(a);
    System.out.println("Sorted array: "+a);

    Collections.reverse(a);
    System.out.println("Reversed array: "+a);
    s.close();
  }
}
