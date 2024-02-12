/*write a java program to create a class instance variable of a class and call the method of a class using the concept of call  by reference*/
package sri;
class Vechile
{
	int eng,silencer;
	public void byk(Vechile o)
	{
		System.out.println(o.eng);
		
		System.out.println(o.silencer);
	}
}
public class Water
{

	public static void main(String[] args)
	{
		Vechile k=new Vechile();
		k.eng=350;
		k.silencer=736;
		k.byk(k);

	}

}
