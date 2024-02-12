package practice2;
import java.util.*;
public class threadpo
{

	public static void main(String[] args)
	{
		    ArrayList<Integer> a=new ArrayList<Integer>();    
		    Scanner s=new Scanner(System.in);
		    int sal,n;
		    System.out.print("Enter no.of values to be stored: ");
		    n=s.nextInt();
		    
		    for(int i=1;i<=n;i++)
		    {
		      System.out.print("Enter value "+(i)+": ");
		      sal=s.nextInt();
		      a.add(sal); // stores value of "sal" at least possible index
		    }
		    
		    System.out.println("Initial array: "+a);
		    System.out.println("Max: "+Collections.max(a));
		    System.out.println("Min: "+Collections.min(a));
		    Collections.sort(a);
		    System.out.println("Sorted array: "+a);
		    Collections.reverse(a);
		    System.out.println("Reversed array: "+a);
		    s.close();    
		  }	
	
}

