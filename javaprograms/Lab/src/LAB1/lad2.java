package LAB1;
import java .util.*;
class QuadraticEquation
{
  int a,b,c;
  
  public void geta(int a) 
  {
	
	  
    this.a=a;
  }
  public void getb(int b)
  {
	 
    this.b=b;
  }
  public void getc(int c)
  {
    this.c=c;
  }
  public int  getDiscriminant() 
  {
    return ((b*b)-(4*a*c));
  }
  public double  getRoot1()
  {
    return (((-b)+Math.sqrt((b*b)-(4*a*c)))/(2*a));
  }
  public double  getRoot2()
  {
    return (((-b)-Math.sqrt((b*b)-(4*a*c)))/(2*a));
  }
}
public class lad2
{

  public static void main(String[] args) 
  {
    System.out.println("Enter a,b,c: ");
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    QuadraticEquation q=new QuadraticEquation();
    q.geta(a);
    q.getb(b);
    q.getc(c);
    System.out.println("Discriminant: "+q.getDiscriminant());
    if ( q.getDiscriminant()>=0 )
    {
      System.out.println("Root 1: "+q.getRoot1());
      System.out.println("Root 2: "+q.getRoot2());
    }
    else if (q.getDiscriminant() < 0 )
    {
      System.out.println("The Equation has no roots.");
    }
    s.close();
  }

}
