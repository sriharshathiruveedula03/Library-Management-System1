package DsCo_4;
public class ShellSort 
{
	    public static void shellSorts(int a[] ,int n)
	    {
	        for(int gap=n/2; gap>0; gap=gap/2)
	        {
	            for(int s=gap; s<n; s++)
	            {
	                int curPos=s;
	                
	                int prvPos=curPos-gap;
	                
	                while(prvPos>=0)
	                {
	                    if(a[prvPos]>a[curPos])
	                    {
	                        int temp=a[prvPos];
	                        a[prvPos]=a[curPos];
	                        a[curPos]=temp;
	                    }
	                    curPos=prvPos;
	                    prvPos=curPos-gap;
	                }
	            }
	        }
	    }
		public static void main(String[] args) 
		{
		    int a[]={12,35,3,24,2,65,435,76};
		    
		    shellSorts(a,a.length);
		    
		    for(int i=0; i<a.length; i++)
		    {
		        System.out.print(a[i]+" ");
		    }
		}
}
