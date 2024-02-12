package Co_01;

import java.util.Scanner;

class over
{
	public void display(int a ,int b)
	{
		System.out.println(a%b);
	}
}
class child extends over
{
	public void display(int a,int b)
	{
		super.display(90,10);
		System.out.println(a/b);
	}
}
public class Superkeyword
{

	public static void main(String[] args)
	{
		int a,b;
		//System.out.println("Enter a nad b value:");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		child o=new child();
		o.display(a, b);
	}

}
