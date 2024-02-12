package sri;
import java.util.*;
class anotherstrong
{
   public int method(int num)
   {
     int fact=1;
     for(int i=num;i>0;i--) 
      {
       fact=fact*i;
      }
      return fact;
    }
}
public class Strongclass
{

	public static void main(String[] args) 
	{
		
		int num,fact,d,sum=0,temp;
		
		Scanner s=new Scanner(System.in);
		
		anotherstrong n=new anotherstrong();
		
		System.out.print("Enter the number: ");
		num=s.nextInt();
		temp=num;
		while(num>0)
		{
		d=num%10;
		fact=n.method(d);
		sum=sum+fact;
		num=num/10;
		}
		if(sum==temp)
		{
		System.out.print(temp+" is a strong number");
		}
		else
		{
		System.out.print(temp+" is not a strong number");
		s.close();
	    }

     }

}











