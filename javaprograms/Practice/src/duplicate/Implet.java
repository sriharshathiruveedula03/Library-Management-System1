package duplicate;

interface sport
{
	public void foot();
}
class game
{
	public void cricket()
	{
		System.out.println("India, America");
	}
}
class cricketer extends game implements sport
{
	public void foot()
	{
		System.out.println("new game");
	}
}
public class Implet
{
	public static void main(String[] args)
	{
		cricketer n=new cricketer();

		n.cricket();
		n.foot();
	}

}
