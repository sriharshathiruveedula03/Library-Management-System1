package Co_01;
class newclass
{
    public newclass()
    {
        this(10);  // Calls "newclass(int parameter1)"

        System.out.println("This is Constructor with no parameters");
    }
    public newclass(int parameter1)
    {
        this(15,30);  // Calls "newclass(int parameter1, int parameter2)"

        System.out.println("This is Constructor with single parameter");
    }

    public newclass(int parameter1, int parameter2)
    {
        System.out.println("This is Constructor with two parameters");
    }
}
public class ConstructorOverloadingandThismethod
{
	public static void main(String[] args)
	{


	}

}
