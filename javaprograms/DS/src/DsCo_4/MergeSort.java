package DsCo_4;
public class MergeSort 
{
	    public static void merge(int A[],int low,int mid,int high)
	    {
	 
	        int temp[]=new int[100];
	        int l1=low;
	        int l2=mid+1;
	        int c=low;
	        while(l1<=mid && l2<=high)
	        {
	            if(A[l1]<A[l2]) 
	            {
	                temp[c]=A[l1];
	                c++;
	                l1++;
	            }
	            else
	            {
	                temp[c]=A[l2];
	                c++;
	                l2++;
	            }
	        }        
	        while(l1<=mid)
	        {
	            temp[c]=A[l1];
	            c++;
                l1++;
	        }

	        while(l2<=high)
	        {
	            temp[c]=A[l2];
	            c++;
                l2++;
	        }
	        for(int i=low;  i<=high;i++)
	        {
	            A[i]=temp[i];
	        }
	    }
	    static void mergeSorts(int A[],int low,int high)
	    {
	        if(low<high)
	        {
	            int mid=(low+high)/2;
	            
	            mergeSorts(A,low,mid);
	            mergeSorts(A,mid+1,high);
	            merge(A,low,mid,high);
	        }
	    }
	    public static void main(String[] args) 
	    {
		    int A[]={10,9,8,7,6,5,4,3,2,1,100,200,300,400,500};
		    
		    mergeSorts(A,0,A.length-1);
		    
		    for(int i=0;i<A.length;i++)
		    {
		        System.out.print(A[i]+" ");
		    }
	    }
}