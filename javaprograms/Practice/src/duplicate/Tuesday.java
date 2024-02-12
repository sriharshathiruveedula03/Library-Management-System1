package duplicate;
import java.util.Scanner;
class firday
{
	public void chair(int a ,int b)
	{
		int p=a+b;
		
		System.out.println("result="+p);
	}
}
public class Tuesday
{
	public static void main(String[] args)
	{	
		Scanner e=new Scanner(System.in);
		 int a=e.nextInt();
		 int b=e.nextInt();
		
		firday o=new firday();
		o.chair(a,b);
		e.close();
	}
}
