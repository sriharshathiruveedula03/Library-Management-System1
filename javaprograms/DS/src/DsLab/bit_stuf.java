package DsLab;
//BIT Stuffing
import java.util.Scanner;
public class bit_stuf 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String z=s.next();
		String flag="01111110";
		String ans=new String();
		for(int i=0;i<z.length();)
		{
			if(z.charAt(i)=='0')
			{
				ans=ans+z.charAt(i);
				i++;
			}
			else if(z.charAt(i)=='1' && i+5<=z.length() && z.substring(i, i+5).compareTo("11111")==0)
			{
				ans=ans+'1';
				ans=ans+'1';
				ans=ans+'1';
				ans=ans+'1';
				ans=ans+'1';
				ans=ans+'0';
				i=i+5;
			}
			else
			{
				ans=ans+z.charAt(i);
				i++;
			}
		}
		System.out.println(ans);
	}
}