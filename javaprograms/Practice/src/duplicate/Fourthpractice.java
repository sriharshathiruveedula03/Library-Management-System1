package duplicate;
import java.util.*;
class MyPoint
{
	double x,y,distance1,distance2;
	public MyPoint()
	   {
	    x = 0;
	    y = 0;
	   }
	 public MyPoint(double X,double Y)
	   {
	   x = X;
	   y = Y;
	   }
	 public double distance(double X,double Y,MyPoint a)
	   {
		 distance1=Math.sqrt(Math.pow (a.x-X, 2)+Math.pow(a.y-y, 2));
		 return distance1;
	 }
	 public double distance(MyPoint a,MyPoint b)
	   {
		 distance2=Math.sqrt(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2));
		 return distance2;
	   }
		
}
public class Fourthpractice
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
	      double x,y;
	      
	      System.out.println("Enter the x co-ordinate of the point : ");
	      x = s.nextDouble();
	      
	      System.out.println("Enter the y co-ordinate of the point : ");
	      y = s.nextDouble();
	      
	      MyPoint a = new MyPoint();
	      
	      MyPoint b = new MyPoint(x,y);
	      
	      System.out.println("The Distance between (0,0) and the input point is"+b.distance(a,b));
	      s.close();
		
	}

}
