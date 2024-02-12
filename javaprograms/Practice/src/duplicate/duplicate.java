package duplicate;
class duplicate1 implements Cloneable
{
  String name;
  int id,c;
  public void set(int id,String name,int cost)
  {
    this.id=id;
    c=cost;
    this.name=name;
  }
  public void print()
  {
    System.out.println("Id:"+this.id+"   name:"+this.name+"   cost:"+c);
  }
  public Object clone() throws CloneNotSupportedException 
  {
    return super.clone();
  } 
}
public class duplicate
{
  public static void main(String[] args) 
  {
        try
        {
          duplicate1 c=new duplicate1();
          System.out.println("Data using original object: ");
          c.set(2000030165,"Madhava Sai Chakka",103500); //original object
          c.print();
          duplicate cc=(duplicate)c.clone();
          System.out.println("Data using dublicate object: ");
          cc.print();           // dublicate obj
        }
        catch(CloneNotSupportedException c)
        {
          
        }
  }  
private void print()
{
	// TODO Auto-generated method stub
	
}
}






