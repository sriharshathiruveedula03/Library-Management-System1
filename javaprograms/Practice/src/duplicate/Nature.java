/*Sum of Natural Numbers using for loop*/


package duplicate;
import java .util.*;
public class Nature
{

	public static void main(String[] args)
	{

	 int sum = 0,i=1;
	 
	 System.out.print("Enter a number: ");
	 
	 Scanner a=new Scanner(System.in);
	 int n = a.nextInt();
  
	 /*n = 100, sum = 0;
	  
	  for(int i = 1; i <= n; ++i)
     {
        sum += i;
     }*/
	 
	 while(i <= n)
     {
         sum =sum+ i;
         i++;
     }
	 
	 System.out.println("Sum = " + sum);
      a.close();
	}
}
