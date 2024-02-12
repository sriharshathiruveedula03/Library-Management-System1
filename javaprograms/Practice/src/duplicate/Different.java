package duplicate;
class gameo
{
	public void cri()
	{
	System.out.print("\nIndia");
	System.out.print("\nUsa");
	}
}
interface sporto
{
	public void footba();
}
class keto extends gameo implements sporto
{
	public void cricket()
	{
		System.out.print("Sri ");
	}
	public void footba()
	{
		System.out.print("Harsha.");
	}
	
}
public class Different
{
	public static void main(String[] args) 
	{
		keto h=new keto();
		h.cricket();
		h.footba();
		h.cri();
    }
}