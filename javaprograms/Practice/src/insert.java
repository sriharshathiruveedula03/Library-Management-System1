class Insert1
{
   public static void insertionSort(int A[],int N)
   {
		int n=A.length;
		
		for(int i=0;i<N;i++)
		{
			for(int j=1;j<(n-i);j++)
			{
				if(A[j-1]>A[j])
				{
					int temp=A[j-1];
					A[j-1]=A[j];
					A[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
	    int AC[]={23,14,6,887,764,46,19,28};
	 
	    insertionSort(AC,AC.length-1);
	    for(int i=0; i<AC.length; i++)
	    {
	        System.out.print(AC[i]+" ");
	    }
	}
} 