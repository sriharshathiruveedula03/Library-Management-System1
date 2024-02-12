package Singleton;
class MobileApplication<T> 
{
	    T aaa;
	    public void set(T baa)
	    {
	        aaa=baa;
	    }
	    public T get() 
	    {
	        return aaa;
	    }
}
public class genirenclass 
{
public static void main(String[] args)  
{
	        MobileApplication<Integer> intg=new MobileApplication<Integer>();
	        intg.set(56);
	        
	        System.out.println(intg.get());
	    }
}
