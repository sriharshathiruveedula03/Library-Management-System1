package sri;
import java.util.Scanner;
public class Count 
{
     public static void main(String[] args) 
	   {
		   int num,sum=0,d;
		   Scanner s=new Scanner(System.in);
		   System.out.print("Enter the number: ");
		   num=s.nextInt();
		   while(num>0)
		   {
		   d=num%10;
		   sum=sum+d;
		   num=num/10;
		   }
		   System.out.print("Sum of digits is "+sum);
		   s.close();
		   }

}
