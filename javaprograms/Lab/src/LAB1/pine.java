package LAB1;
import java.util.Scanner;
public class pine
{
	public static boolean Passengerage(int age)
	{
		if( age>=60 && age<=100) {
			return true;
		}
		else {
			return false;
		}
	}
	public static boolean trainNumber(int trainno)
	{
		if(trainno>=1000 && trainno <=3000)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private static void assertEquals(boolean b)
	{
		if(b==true)
		{
			System.out.println("valid");
		}
		if(b==false)
		{
			System.out.println("invalid");
		}
	}
	public static boolean year(int year)
	{
		if(year<=1960 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int age=sc.nextInt();
		int trainno=sc.nextInt();
		int year=sc.nextInt(); 
		assertEquals(Passengerage(age)); 
		assertEquals(trainNumber(trainno)); 
		assertEquals(year(year));
	}
}
