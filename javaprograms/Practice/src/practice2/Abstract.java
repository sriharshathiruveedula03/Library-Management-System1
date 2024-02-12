package practice2;

import java.util.Scanner;


abstract class mother
{
	public abstract void mothermethod();

	public abstract void good(int a,int b);
	{
		System.out.println("hai");
	}
}

interface father
{
	public void fathermethod();
}

class son extends mother implements father
{
	public void mothermethod()
	{
		System.out.println("Mother property");
	}
	public void fathermethod()
	{
		System.out.println("Father property");
	}
	public void good(int a,int b)
	{
		if(a > b)
		{
			System.out.println("a is big");
		}
		else
		{
			System.out.println("b is big");
		}
		}
		public void sonmethod()
		{
			System.out.println("Son property");
		}
}

public class Abstract
{
	public static void main(String[] args)
	{
		System.out.println("Enter a nad b values:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();

		son sl=new son();
		sl.mothermethod();
		sl.fathermethod();
		sl.sonmethod();
		sl.good(a,b);
		s.close();
	}
}