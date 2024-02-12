package practice3;
class edokokaclass extends Thread
{     // implements Runnable
	  public void run()
	  {
	    for(int i=1;i<=5;i++)
	    {
	      System.out.println(i+" -- "+Thread.currentThread().getName());
	    }
	  }
	}
	class edokoakclass2 extends edokokaclass
	{
	  public void run()
	  {
	    for(int i=1;i<=5;i++) 
	    {
	      System.out.println(i+" -- "+Thread.currentThread().getName());
	    }
	  }
	}
	public class Exceptionss 
	{

		public static void main(String[] args)
		{	
	    edokokaclass o=new edokokaclass();
	    edokoakclass2 o1=new edokoakclass2();
	    
	    o.start();
	    o1.start();
	    System.out.println("Hello");
	  }
}
