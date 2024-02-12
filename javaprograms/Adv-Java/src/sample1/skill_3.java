package sample1;
import java.util.*;
public class skill_3
{
	String bharatformula=" an+deg";
	String serumfourmula=" qpz+rtxc";
	public String getBharatformula()
	{
	 return bharatformula;
	}
	public String getSerumformula()
	{
		return "serumformula";
	}
	public static void main(String args[])
	{
		skill_3 v=new skill_3();
		Scanner s=new Scanner (System.in);
		
		System.out.println("vaccines formula-\n1.Bharath biotech formula\n2.Serum institute formula");
		
		int a=s.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("Bharath biotect vaccine formula-> ");
			System.out.println(v.getBharatformula());
			break;
		
		
		case 2:
			System.out.println("Serum intitute vaccine formula-> ");
			System.out.println(v.getSerumformula());
			break;
			
			default:
				System.out.println("please enter value");
		s.close();
		}
	}
}