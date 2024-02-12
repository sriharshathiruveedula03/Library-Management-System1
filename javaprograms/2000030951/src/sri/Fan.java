/*write a java program for call by value by passing the values as parameters which are taken as inputs from key board*/
package sri;
import java.util.Scanner;
class light
{
	public void tree(int a, int b)
	{
		
		System.out.println("The Entered a value is "+a);
		System.out.println("The Entered b value is "+b);
	}
}
public class Fan
{

	public static void main(String[] args)
	{
		
		int n,m;
		
		Scanner z=new Scanner(System.in);
		System.out.println("Enter a value:");
		n=z.nextInt();
		System.out.println("Enter b value:");
		m=z.nextInt();
		light x=new light();
		x.tree(n,m);
		z.close();

	}

}
