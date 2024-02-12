package practice3;

interface mother
{
	  public void mothermethod();
}
interface father extends mother
{
	public void fathermethod();
}
class son implements father
{
	public void mothermethod()
	{
	System.out.println("Mother property");
	}
	public void fathermethod()
	{
	System.out.println("Father property");
	}
	public void sonmethod()
	{
	System.out.println("Son property");
	}
}
public class InterfaceProgram
{
	public static void main(String[] args)
	{
		son m = new son();

		m.fathermethod();
		m.mothermethod();
		m.sonmethod();
	}

}


/*package practice2;
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
}*/