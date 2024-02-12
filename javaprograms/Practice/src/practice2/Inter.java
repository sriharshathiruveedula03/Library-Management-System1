package practice2;
class cool
{
	int a=10;
	public void vip() 
	{
		System.out.println("vip");
		
	}
	
}
class click extends cool
{
	public void some()
	{
		System.out.println("vipss");
	}
}
public class Inter 
{

	public static void main(String[] args)
	{
		
		cool j=new cool();
		j.vip();
		
		click h=new click();
		h.some();
		
		System.out.println(j.a);
		

	}

}
