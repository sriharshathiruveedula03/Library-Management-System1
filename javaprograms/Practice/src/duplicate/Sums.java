package duplicate;
interface first_interface
{
  void areaofcircle(int r);
  void quadratic(int a,int b,int c);
}
abstract class first_abstract
{
  abstract void distance(int x1,int x2,int y1,int y2);
  double volume(int r)
  {
    double vol=((1.33)*(3.14)*(r)*(r)*(r));
    return vol;
  }
}
class child extends first_abstract implements first_interface 
{
  public void areaofcircle(int r) 
  {
    double are=((3.14)*(r)*(r));
    System.out.println("Area: "+are);
  }
  public void quadratic(int a, int b, int c) 
  {
    double dis=((b*b)-(4*a*c));
    if (dis >= 0) 
    {
      System.out.println("Discriminant greater than zero so, there are two roots.");
      System.out.println("Root1: "+(((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a)));
      System.out.println("Root2: "+(((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a)));
    }
    else if (dis < 0)
    {
        System.out.println("Discriminant is less than zero so, roots are imaginary.");
    }
  }
  void distance(int x1, int x2, int y1, int y2) 
  {
    double dist=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)));
    System.out.println("Distance: "+dist);
  }
}
public class Sums 
{

	public static void main(String[] args) 
	{
    child c=new child();
    c.areaofcircle(3);
    c.distance(2, 1, -6, 1);
    c.quadratic(2, 2, 4);
    c.volume(2);

  }
}
