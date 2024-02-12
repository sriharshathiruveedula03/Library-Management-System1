/*Consider a set of car names given as inputs through console and store in an ArrayList. The task is to sort and 
print them using iterator. */
package Co_01;
import java.util.*;
public class  iterater
{
  public static void main(String[] args) 
  {
    ArrayList<String> a=new ArrayList<String>();
    Scanner s=new Scanner(System.in);
    System.out.print("Enter number of names to be stored: ");
    int arrsize=s.nextInt();
    
    String temp;
    for(int i=0; i<arrsize; i++) 
    {
      temp=s.next();
      a.add(temp);
      
    }
    Iterator<String> it=a.iterator();
    while(it.hasNext())
    {
      System.out.println(it.next());
      
    }
    s.close();
  }

}