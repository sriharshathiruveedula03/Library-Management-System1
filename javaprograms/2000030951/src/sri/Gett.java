package sri;
import java.util.Scanner;
class harsha
{
	int v;
	public void setvalue(int a)
	{
		v=a;
	}
	public int getvalue()
	{
		return v; 
	}
	public String toString()
	{
		return "The value is:"+v;
	}
}
public class Gett 
{

	public static void main(String[] args)
	{
	
		int b;
		System.out.println("Enter v value:");
		Scanner n=new Scanner(System.in);
		b=n.nextInt();
		
		harsha k=new harsha();
		k.setvalue(b);

		
		System.out.println("Entered value is: "+k.getvalue());

		System.out.println("Entered value from to String: "+k);
		
		n.close();
	}
}
