package sri;
import java.util.*;
public class Array 
{

	public static void main(String[] args)
	{
		
		int i,sum=0;
		int[] a=new int[5];
		
		try (Scanner s = new Scanner(System.in))
		{
			System.out.println("Enter elements into array:");
			for(i=0;i<a.length;i++)
			{
				a[i]=s.nextInt();
			}
			for(i=0;i<a.length;i++)
			{
				sum=sum+a[i];
				
			}
			System.out.println(sum);
			
			s.close();
		}
	}       
}