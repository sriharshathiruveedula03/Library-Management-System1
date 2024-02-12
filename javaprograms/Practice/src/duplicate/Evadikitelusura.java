package duplicate;

abstract class Sec_9
{
	abstract void solution(int n);
}
class reverse extends Sec_9
{
	void solution(int n)
	{
		int d,rev = 0;
		int temp = n;
		while(n > 0)
		{
			d = n % 10;
			rev = ( rev * 10 ) + (d);
			n = n / 10;
		}
		System.out.println("Reverse of "+temp+" is "+rev);
	}
}
class fact extends Sec_9
{
	void solution(int n)
	{
		int temp = n;
		for(int i = n - 1; i > 0;i--)
		{
			n = n * i;
		}
		System.out.println("Factorial of "+temp+" is "+n);
	}
}

public class Evadikitelusura
{
	public static void main(String[] args)
	{
		fact f=new fact();
		f.solution(5);

		reverse r=new reverse();
		r.solution(4321);
	}
}
