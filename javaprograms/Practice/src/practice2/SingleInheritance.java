package practice2;

class father1
{
	int a = 10;
	public void fathermethod()
	{
		System.out.println("Father property");
	}
}
class son2 extends father1
{
	//extends: child of
	public void sonmethod()
	{
		System.out.println("child property");
	}
}

public class SingleInheritance
{
	public static void main(String args[])
	{
		son2 s=new son2();
	    s.sonmethod();
	    s.fathermethod();
	    System.out.print(s.a);
	}
}