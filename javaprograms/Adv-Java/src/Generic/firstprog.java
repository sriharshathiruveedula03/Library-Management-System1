package Generic;
import java.util.*;
class Test<T>
{
	T obj;
	
	Test(T objsample)
	{
		this.obj=objsample;
	}
	public T getObject()
	{
		return this.obj;
	}
}
public class firstprog 
{

	public static void main(String[] args)
	{
		Test <Integer> intObj = new Test<Integer>(15);
		System.out.println(intObj.getObject());
		
		Test<String>stringObj=new Test<String>("hello");
		System.out.println(stringObj.getObject());
	}
}
