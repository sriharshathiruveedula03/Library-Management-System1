package duplicate;
import java.util.*;
class hai
{
	public void kite()
	{
	int a;
	System.out.println("Enter the amount:");
	Scanner z=new Scanner(System.in);
	a=z.nextInt();
	
	 if (a>=1000)
	 {
	 a=a-200;
	 }
	 else if (a>=500)
	 {
	 a=a-100;
	 }
	 else if (a>=100)
	 {
	 a=a-50;
	 }
	 else
	 {
	 System.out.println("no discount");
	 }
	 System.out.println("Bill to pay after discount : "+a);
	 z.close();
	 }
}
public class third
{
	public static void main(String[] args)
	{
	
	hai k=new hai();

	k.kite();
	}
}

