package sri;
import java.util.*;

public class Arr1
{
  public static void main(String args[])
  {
    int n,sum = 0;
    Scanner s=new Scanner(System.in);
    System.out.print("Enter no.of Elements in array: ");
    n = s.nextInt();
    int[] a = new int[n];

    for(int i=0;i<n;i++)
    {
      System.out.print("Enter "+(i+1)+" Element: ");
      a[i] = s.nextInt();
      sum = sum + a[i];
    }

    System.out.print("\n");
    System.out.print("Sum: "+sum);
    s.close();
  }
}
