package DsCo_2;
import java.util.Scanner;
class Quadratic
{
	int a[]=new int[20];
	int m=20;
	public void insert()
	{
		int key,x,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter key");
		key=s.nextInt();
		x=key%m;
		if(a[x]==0)
		{
			a[x]=key;
		}
		else
		{
			for(i=1;i<a.length;i++)
			{
				x=key+(i*i)%m;
				if(a[x]==0)
				{
					a[x]=key;
				}	
			}
		}
	}
	public void deletion()
	{
		int key,x,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter key element for deletion");
		key=s.nextInt();
		x=key%m;
		
		if(a[x]==key)
		{
			a[x]=0;
		}
		else
		{
			for(i=1;i<a.length;i++)
			{
				x=key+(i*i)%m;
				if(a[x]!=key)
				{
					continue;
				}
				else
				{
					a[x]=0;
					break;
				}	
			}
		}
	}
	public void display()
	{
		int i;
		for(i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.println(a[i]);
			}
		}
	}
	public void search()
	{
		int key,x,i,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter key element to search");
		key=s.nextInt();
		x=key%m;
		
		if(a[x]==key)
		{
			count++;
		}
		else
		{
			for(i=1;i<a.length;i++)
			{
				x=(key+(i*i))%m;
				if(a[x]!=key)
				{
					continue;
				}
				else
				{
				  count++;
					break;
				}	
			}
			if(count==0)
			{
				System.out.println("---Not found---");
		    }
			else
			{
				System.out.println("------Found-----");
			}
		}
	}	
}
public class QuadraticProbing
{
	public static void main(String[] args) 
	{
		int ch;
		Quadratic n=new  Quadratic();
  		Scanner k=new Scanner(System.in);
  		
  		  while(true)
      	   {
      		System.out.println("1.insert");
      		System.out.println("2.deletion");
      		System.out.println("3.search");
      		System.out.println("4.display");
      		System.out.println("5. Exit this loop");
      		System.out.print("Enter Your Choise: "); 
      		
      		ch=k.nextInt();
      		
      		switch(ch)
      		{
      		case 1:n.insert();
      		break;
      		
      		case 2:n.deletion();
      		break;
      		
      		case 3:n.search();
      		break;
      		
      		case 4 :n.display();
      		break;
      		
      		case 5 : System.exit(0);
      		
            default: System.out.println("Invalid Choice.");
      		break;
      		}
      	}
	}
}
