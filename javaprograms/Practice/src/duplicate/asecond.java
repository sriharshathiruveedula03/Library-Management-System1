/*write a java program create to a class Building with the methods area and volume.read the input values through 
 * the key board and pass the values to the methods as parametersa and calcutate area of rectangle and volume of cubiode  */
 package duplicate;
class hari
{
  public void area(int l,int b)
    {
      System.out.println(l*b);
    }
    public void volume(float l,float b,float h)
    {
        System.out.println(l*b*h);
    }
}
public class asecond 
{
	public static void main(String[] args) 
		    {
		        hari z=new hari();
		        
		        z.area(10,20);
		        z.volume(10,20,30);
		    }
}
