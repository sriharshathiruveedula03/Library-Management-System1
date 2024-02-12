package Singleton;
//A Simple Java program to show working of user defined
//Generic classes

//We use < > to specify Parameter type

class Test<T>
{
	
	// An object of type T is declared
	T obj;
	Test(T objsample)
	{
		this.obj = objsample;
	} // constructor
	
	public T getObject()
	{
		return this.obj; 
	}
}

// Driver class to test above
public class hi
{
	public static void main (String[] args)
	{
		// instance of Integer type
		Test <Integer> intObj = new Test<Integer>(15);
		System.out.println(intObj.getObject());
		

		// instance of String type
		Test <String> stringObj =new Test<String>("God");
		System.out.println(stringObj.getObject());
	}
}
