package DsCo_1;
import java.util.Scanner;
public class LinearSearch
{
	public static void main(String[] args)
	{
		int a[]=new int[5];
		int key,i,count=0;
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements");
	
		for(i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
	
		System.out.println("enter key element");
		key=s.nextInt();
	
		for(i=0;i<a.length;i++)
		{
			if(a[i]==key)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("not found");
		}
		else
		{
			System.out.println("Found");
		}
	}
} 