package Co_01;
class notmainclass
{
    static int value=10;
    public static void method() 
    {
        System.out.println("We are in notmainclass");
    }
}
public class Static
{
	public static void main(String[] args)
	{
	    // no object needed for satatic variables and methods, instead call them using class name itself
		
	    notmainclass.method();
	    System.out.println("Value of instance variable: "+notmainclass.value);
	    
	}
}
