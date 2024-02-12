package Co_01;
import java.util.Scanner;
class play
{
	public void surya()
	{
		System.out.println("hello friends");
	}
	public void surya(int x)
	{
		System.out.println("hai");
	}
	public void surya(int a, int b)
	{
		System.out.println("Result");
	}
}

public class MethodOverLoading
{
	public static void main(String[] args)
	{
		int x , a, b;

		System.out.println("Enter x value:");
		System.out.println("Enter a value:");
		System.out.println("Enter b value:");

		Scanner s = new Scanner(System.in);
		x = s.nextInt();
		a = s.nextInt();
		b = s.nextInt();

		play h = new play();

		h.surya();
		h.surya(x);
		h.surya(a,b);

		System.out.println("Entered x value is:" + x);
		System.out.println("Entered a value is:" + a);
		System.out.println("Entered b value is:" + b);

		s.close();
	}
}
