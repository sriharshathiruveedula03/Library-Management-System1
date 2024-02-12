package duplicate;
public class A5 
{
	public static void main(String[] args)
	{
		int[] a=new int[3];
		
		String s="harsha";
		
		try
		{
			try
			{
				System.out.println(a[7]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println(s.length());
		}
		catch(Exception k)
		{
			System.out.println(k);
		}

	}

}
