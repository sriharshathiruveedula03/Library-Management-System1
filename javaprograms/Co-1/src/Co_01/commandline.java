package Co_01;
public class commandline
{
	public static void main(String[] args)
	{
		
		int[] a=new int[6];
		
	    a[0]=Integer.valueOf(args[0]);
	    a[1]=Integer.valueOf(args[1]);
	    a[2]=Integer.valueOf(args[2]);
	    a[3]=Integer.valueOf(args[3]);
	    a[4]=Integer.valueOf(args[4]);
	    a[5]=Integer.valueOf(args[5]);
	    
	    int sum=0;
	    for( int i=0; i<6;i ++) 
	    {
	      sum=sum+a[i];
	    }
	    
	    int avg=sum/6;
	    System.out.println("total="+sum);
	    System.out.println("avg="+avg);
	}

}
