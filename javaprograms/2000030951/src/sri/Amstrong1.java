package sri;
import java.util.*;
class number12
{
	public int cube(int d)
	{
		int result;
		result=d*d*d;
		return result;
	}
}
public class Amstrong1
{
	public static void main(String[] args)
	{
		int num,d,sum=0,cube,temp;
	    number12 z=new number12();
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the number: ");
	    num=s.nextInt();
	    temp=num;
		while(num>0)
		{
		   d=num%10;
		   cube=z.cube(d);
		   sum=sum+cube;
		   num=num/10;
		}
		if(sum==temp) 
		{
		   System.out.print(temp+" is a Amstrong number");
		}
		else
		{
		   System.out.print(temp+" is not a Amstrong number");
		}
		s.close();
	}
}
