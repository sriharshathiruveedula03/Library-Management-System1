/*Array:Write a java program to create a class car with method audio and access the properties  class called using array of objects*/
package sri;
class car
{
	public void audio()
	{
		System.out.println("New BMW car");
		System.out.println("New range rover car");
	}
}
public class Water1
{

	public static void main(String[] args)
	{
		car[] a=new car[2];
		
		a[0]=new car();
		a[1]=new car();
		
		a[0].audio();
		a[1].audio();

	}

}
