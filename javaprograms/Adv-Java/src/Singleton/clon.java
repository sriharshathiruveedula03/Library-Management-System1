package Singleton;
import java.util.*;
class cate implements Cloneable
{
  String n;
  int i,c;
  public void set(int id,String name,int cost) {
    i=id;
    c=cost;
    n=name;
    
  }
  public void print()
  {
    System.out.println("Id:"+i+" name:"+n+" cost:"+c);
  }
  public Object clone() throws CloneNotSupportedException 
  {
    return super.clone();
  }
  
}
public class clon {

  public static void main(String[] args) {
    try
        {
          duplicate dup1=new duplicate();
          dup1.set(2,"book",3000);
          duplicate dup2=(duplicate)dup1.clone();
          dup2.print();
        }
        catch(CloneNotSupportedException c)
        {
          
        }
  }

}