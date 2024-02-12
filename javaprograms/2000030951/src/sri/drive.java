package sri;
import java.util.*;
class even1
{
	public void evn(int a)
	{
		
		if(a%2==0)
		{
		System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	public void big(int c,int d)
	{
		
		if(c<d)
		{
			System.out.println("d is big");
		}
		else
		{
			System.out.println("c is big");
		}
		
	}
	public void fact(int n)
	{
		for(int i=n-1;i>0;i--)
		{
			n=n*i;
		}
		System.out.println(n);
	}
	public void volume(int l,int b,int h)
	{
		System.out.println("volume of a cube:"+l*b*h);
	}
		
}
public class drive
{

	public static void main(String[] args) 
	{
		even1 x=new even1();
		Scanner z=new Scanner(System.in);
		
		
		
		int ch,v,r,k,e;
		while(true)
		{
			System.out.println("Enter 1 for checking for even or odd number:");
			System.out.println("Enter 2 for Biggest of two numbers:");
			System.out.println("Enter 3 for factorial of given number:");
			System.out.println("Enter 4 for volume of a cube:");
			System.out.println("Enter your Choice:");
			ch=z.nextInt();
			
			switch(ch)
			{
				case 1: System.out.println("Ente a number to find even or odd:");
				        v=z.nextInt();
					    x.evn(v);
					    break;
				
				case 2: System.out.println("Ente a number to find biggest of two:");
						v=z.nextInt();
						r=z.nextInt();
						x.big(v,r);
						break;
				
				case 3: System.out.println("Ente a number to find factorial:");
				        v=z.nextInt();
				        x.fact(v);
				        break;
				
				case 4:System.out.println("Ente a number to find volume of cube:");
						v=z.nextInt();
						k=z.nextInt();
						e=z.nextInt();
						x.volume(v,k,e);
						break;
				
				default :System.exit(0);
				z.close();
			}
			
		}

	}

}

