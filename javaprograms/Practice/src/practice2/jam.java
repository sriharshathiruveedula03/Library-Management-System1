package practice2;
import java .util.*;
interface moon
{
	public void noo(int n);
}
interface sun
{
public void tea();
}
class kik implements moon,sun
{
	public void noo(int n)
	
	{
		for(int i=1;i<n;i++)
		System.out.println("hi"+i);
	}
	public void tea()
	{
		System.out.println("hai");
	}
	public void fann()
	{
		System.out.println("lake");
	}
}

	
public class jam 
{
	  public static void main(String[] args)
	  {
		  int n;
		  Scanner h=new Scanner(System.in);
		  n=h.nextInt();
		  
		  kik j=new kik();
		  j.noo(n);
		  j.tea();
		  j.fann();
		  h.close();
		  
	  }
}
