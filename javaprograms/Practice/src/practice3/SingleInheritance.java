//Single Inheritance
package practice3;
class mango
{
	int h=90;
	public void grap()
	{
		System.out.println("hai-1");
	}
}
class fan extends mango
{
	int y=88;
	public void me()
	{
		System.out.println("hello-2");
	}
	
}
public class SingleInheritance
{
	public static void main(String[] args)
	{
		fan u=new fan();
	
		u.grap();
		u.me();
		System.out.println(u.y);
	}

}
