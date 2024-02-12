package duplicate;
abstract class lapto
{
	public abstract void win(int a,int b);
	public void wino()
	{
		  try
		   {
			throw new ArrayIndexOutOfBoundsException(); 
		   }
		    catch(ArrayIndexOutOfBoundsException r)
		    {
			 System.out.println(r);
		     }
	    }
	 
}
class range extends lapto
{
	public void win(int a,int b)
	{
		if(a%b==0)
		{
			System.out.println("a is big");
		}
		else
		{
			System.out.println("b is big");
		}
	}
}
public class A6 
{

	public static void main(String[] args)
	{
		
		range r=new range();
		r.win(10, 20);
		r.wino();
		
	}
}
