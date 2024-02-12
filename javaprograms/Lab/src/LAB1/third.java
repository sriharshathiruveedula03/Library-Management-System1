/*Rework on Lab 1 (Factorial example) by considering input through   a)command line argument   b) console.*/
package LAB1;
import java.util.Scanner;
public class third
{
	public static void main(String args[]) 
		  {
		    int num=Integer.valueOf(args[0]);
		    
		    int temp=num;
		    for(int i=num-1;i>0;i--) 
		    {
		      num=num*i;
		    }
		    
		    System.out.print("Factorial of "+temp+"(Given through command line) is "+num+"\n");
		    Scanner s=new Scanner(System.in);
		    System.out.print("Enter a number: ");
		    int n=s.nextInt();
		    int te=n;
		    
		    for(int i=n-1;i>0;i--)
		    {
		      n=n*i;
		    }
		    System.out.print("Factorial of "+te+"(Given through scanner) is "+n);
		    s.close();
		  }
}
		

