package practice3;
class ice
{
	int a=100;
	public void vellina()
	{
		System.out.println("koo");
	}
	
}
class pine extends ice
{
	public void cone()
	{
		System.out.println("boo");
	}
}
class berry extends pine
{
	int e=99;
}
public class MultilevelInheritance
{

	public static void main(String[] args)
	{
		
	  berry u=new berry();
	  System.out.println(u.a);
	  u.vellina();
	  u.cone();
	  System.out.println(u.e);

	}

}
/*class grandfather 
 * {
  int a=10;
  public void grandfathermethod()
   {
    System.out.println("Grandfather property");
  }
}
class father extends grandfather 
{
  public void fathermethod()
   {
    System.out.println("father property");
  }
}
class son extends father
 {
  int w=6;
}
public class Harsha
{
  public static void main(String[] args)
   {
    son s=new son();
    s.fathermethod();
    s.grandfathermethod();
    father f=new father();
    f.fathermethod();
    f.grandfathermethod();
    grandfather g=new grandfather();
    g.grandfathermethod();
    System.out.println(s.w);
    System.out.println(s.a);
  }
}*/
