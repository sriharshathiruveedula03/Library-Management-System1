package LAB1;
import java .util.*;
public class LABQ11 
{

	public static void main(String[] args)
	{
		
		int n;
		System.out.println("Enter the age:");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
	    if(n>18)
	    {
	      System.out.println("VOTER IS ELIGIBLE TO VOTE");
	    }
	    else 
	    {
	      try 
	      {
	        throw new Exception("VOTER IS NOT ELIGIBLE TO VOTE");
	      }
	      catch (Exception e) 
	      {
	        System.out.println(e);
	        //System.out.println("VOTER IS NOT ELIGIBLE TO VOTE");
	      }
	     
	    }
	    
	  }
	
}
	
	