package sample1;
class MobileApplication<T>
{
	T a;
	public void set(T b)
	{
		a=b;
	}
	public T get()
	{
		return a;
	}
}
public class skill_4 
{
	public static void main(String[] args)
	{
		MobileApplication<Integer> o=new MobileApplication<Integer>();
		o.set(2000030951);
		MobileApplication<String> k=new MobileApplication<String>();
		k.set("My name is SRI HARSHA");
		MobileApplication<Double> z=new MobileApplication<Double>();
		z.set(98.88);
		System.out.println(o.get());
		System.out.println(k.get());
		System.out.println(z.get());
	}
}