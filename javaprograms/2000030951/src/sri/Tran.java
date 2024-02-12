package sri;
import java.util.Scanner;
public class Tran
{
   public static void main(String[] args) 
	{
		
		int i,j;
		int[][] a=new int[3][3];
		
		Scanner s=new Scanner(System.in);
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print((i+1)+" row "+(j+1)+" col: ");
				a[i][j]=s.nextInt();
			}
		}
		System.out.print("The Entered Matrix is:\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{	
			System.out.print("\t"+a[i][j]);
		    }
			System.out.print("\n");
		}
		System.out.print("\n");
		
		System.out.print("The transpose Matrix is:\n");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{	
			System.out.print("\t"+a[j][i]);
		    }
			System.out.print("\n");
		}
		
	}

}


