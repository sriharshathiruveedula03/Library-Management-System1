package class2;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import class1.JunitClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({Add1.class,Sub1.class,Mul1.class,Div1.class})
public class Menu
{
	
}
class Add1
{
	@Test
	void test()
	{
		hai junit=new hai();
		int result=junit.add(10,10);
		assertEquals(20,result);
	}
}
class Sub1
{
	@Test
	void test()
	{
		hai junit=new hai();
		int result=junit.sub(10,5);
		assertEquals(5,result);
	}
}
class Mul1
{
	@Test
	void test()
	{
		hai junit=new hai();
		int result=junit.mul(10,5);
		assertEquals(50,result);
	}
}
class Div1
{ 
	@Test
	void test()
	{
		hai junit=new hai();
		int result=junit.div(8,2);
		assertEquals(4,result);
	}
}
class hai 
{
	public int add(int a, int b)
	{
		return  a+b;
	}
	  public int subract(int i,int j)
	  {
	    return 0;
	    
	  }
	  public int sub(int a,int b)
	  {
	    return a-b;
	  }
	  public int mul(int a,int b)
	  {
	    return a*b;
	  }
	  public int div(int a,int b)
	  {
	    return a/b;
	  }
}
