package Co_01;
class biggest
{
	int a,b,c;
	public void setvalue(int A,int B,int C)
	{
		a = A;
		b = B;
		c = C;
	}
	public int getvalue()
	{
		if(a > b && a > c)
		{
			return a;
		}
		else if(b > c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public String toString()
	{
		return "hi";
	}
}
public class Setter_Getter
{
	public static void main(String[] args)
	{
		biggest b=new biggest();

		b.setvalue(10,20,50);

		System.out.println("biggest is = "+b.getvalue());
		System.out.println(b);
	}
}
