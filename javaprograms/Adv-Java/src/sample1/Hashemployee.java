package sample1;
import java.util.*;
public class Hashemployee 
{
	public static void main(String args[]) 
	{
		HashMap<Integer, Employees> o = new HashMap<Integer,Employees>();
		o.put(1, new Employees("Raghava"));
		o.put(2,new Employees("Raju"));
		o.put(3, new Employees("Shanmukh"));
		o.put(4,new Employees("Suresh"));
		o.put(5, new Employees("Pavan"));
		Set set = o.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) 
		{
			Map.Entry h = (Map.Entry)iterator.next();
			System.out.print("key is: "+ h.getKey() + " & Value is: ");
			System.out.println(h.getValue());
			}
		o.remove(3);
		Iterator iterator1 = set.iterator();
		System.out.println("Removing");
		while(iterator1.hasNext()) 
		{
			Map.Entry j = (Map.Entry)iterator1.next();
			System.out.print("key is: "+ j.getKey() + " & Value is: ");
			System.out.println(j.getValue());
		}
		o.put(5,new Employees("Pavan"));
		Iterator iterator2 = set.iterator();
		System.out.println("Updating");
		while(iterator2.hasNext()) 
		{
			Map.Entry l= (Map.Entry)iterator2.next();
			System.out.print("key is: "+ l.getKey() + " & Value is: ");
			System.out.println(l.getValue()); 
		}
		System.out.println("Taking one value into consederation:");
		System.out.println(o.get(2)); 
	}
}
	