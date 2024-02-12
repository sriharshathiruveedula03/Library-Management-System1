package Singleton;
class duplicate implements Cloneable
{
  String n;
  int i,c;
  public void set(int id,String name,int cost)
  {
    id=id;
    cost=cost;
    name=name;
  }
  public void print()
  {
    System.out.println("Id_no:"+i+" Name:"+n+" cost:"+c);
  }
  public Object clone() throws CloneNotSupportedException 
  {
    return super.clone();
  }
  
}
public class harsha
{
  public static void main(String[] args) 
  {
     try
          {
            duplicate dup1=new duplicate();
            dup1.set(200,"Books",100);
            duplicate dup2=(duplicate)dup1.clone();
            dup2.print();
          }
          catch(CloneNotSupportedException c)
          {
            
          }
  }

}