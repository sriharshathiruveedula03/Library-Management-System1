package DsCo_1;
import java.util.*;
public class BinarySearch
{
  public static void main(String[] rgs)
  {

    Scanner s=new Scanner(System.in);
    System.out.print("Enter number of value to store: ");
    int size=s.nextInt();
    int[] a=new int[size];

    System.out.println("Enter "+size+" values:");

    for(int i=0;i<size;i++)
    {
      a[i]=s.nextInt();
    }

    System.out.print("Enter a value to search: ");
    int key=s.nextInt();

    int  count=0;

    int mid,low=0,high=a.length;

    while(low<=high)
    {
      mid=(low+high)/2;

      if(a[mid]==key)
      {
    	  count++;
          break;
      }
      else if(a[mid]>key)
      {
        high=mid-1;
      }
      else if(a[mid]<key)
      {
        low=mid+1;
      }
    }
    if(count==0)
    {
      System.out.println("Not Found...");
    }
    else
    {
      System.out.println("Found");
    }
  }
}