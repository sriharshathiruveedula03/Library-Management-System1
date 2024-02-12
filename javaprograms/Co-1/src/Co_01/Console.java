package Co_01;
import java.util.Scanner;
public class Console
{
	public static void main(String[] args) 
	{
		int sum=0,i,n,r,z,fact=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		z=n;
		while(n>0)
		{
			r=n%10;
			fact=1;
			for(i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(z==sum)
		{
			System.out.println("strong number");
		}
		else
		{
			System.out.println(" NOt a strong number");
		}
	}
}
