package Singleton;
import java.lang.*;
import java.util.*;
public class Student1 implements Comparable<Student1>{
	private String Name;
	private int Age;
	public Student1(String Name,int Age)
	{
		this.Name=Name;
		this.Age=Age;
	}
	public int getAge()
	{
		return this.Age;
	}
	public String getName()
	{
		return this.Name;
	}
	public String toString()
	{
		return " ";
	}
	public int compareTo(Student1 per)
	{
		if(this.Age==per.Age)
			return 0;
		else
			return this.Age>per.Age ?1:-1;
	}

	public static void main(String[] args) 
	{
		Student1 e1=new Student1("ram",20);
		Student1 e2=new Student1("krishna",30);
		int retval=e1.compareTo(e2);
		switch(retval)
		{
		case -1:System.out.println("The "+e2.getName()+" is older than "+e1.getName());
		break;
		case 1:System.out.println("The "+e1.getName()+"  is older than "+e2.getName());
		break;
		default:System.out.println("both are of same age");
	}

}
}
