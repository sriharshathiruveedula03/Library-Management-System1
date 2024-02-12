/*Java Methods*/
package sri;
import java.util.Scanner;
class hai
{
  public int  add(int a ,int b)
  {
	  int sum=a+b;
	  return sum;
  }
}

public class Return
{
	public static void main(String args[])
	{
		int x,y;
		Scanner b=new Scanner(System.in);
		System.out.println("Enter x value:");
		x=b.nextInt();
		System.out.println("Enter y value:");
		y=b.nextInt();
		
		hai s=new hai();
		int result =s.add(x,y);
		
		System.out.println("Sum is "+result);
		b.close();
	}
}
