package Co_01;
import java.util.*;
class newc 
{
    String name;
    long id;
}
public class Arrayofobjects
{
	public static void main(String[] args)
	{
		System.out.println("Enter no. of objects");
		Scanner s=new Scanner(System.in);
		int arrsize=s.nextInt();
		
		newc[] a=new newc[arrsize];
		
		for(int i=0; i<arrsize; i++) 
		{
		    a[i]=new newc();
		}
		for(int i=0; i<arrsize; i++) 
		{
		    System.out.print("Enter Name "+(i+1)+": ");
		    a[i].name=s.next();
		    
		    System.out.print("Enter Id for "+a[i].name+": ");
		    a[i].id=s.nextLong();
		}
		
		for(int i=0; i<arrsize; i++) 
		{
		    System.out.println("\nDetails of "+(i+1)+" Student is: ");
		    System.out.println("Name: "+a[i].name);
		    System.out.println("ID:"+a[i].id);
		}
	}
}









