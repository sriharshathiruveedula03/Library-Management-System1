package sri;
import java.util.*;
public class Strong
{

	public static void main(String[] args)
	{
		int sum=0,i,r,n,z,fact=1;
	       Scanner p=new Scanner(System.in);
	       System.out.println("Enter n value:");
	       n=p.nextInt();
	       z=n;
	       while(n>0)
	       {
	          r=n%10;
	          fact=1;
	          for(i=1;i<=r;i++)
	          {
	              fact=fact*i;
	          }
	          sum=sum+fact;
	          n=n/10;
	       }
	       if(z==sum)
	       {
	           System.out.println(z+" is a strong number");
	       }
	       else
	       {
	           System.out.println(z+"is not an strong number");
	       }
    }

}
