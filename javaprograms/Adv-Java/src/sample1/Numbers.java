package sample1;
import java.util.*;
public class Numbers
{
	Numbers(double a,double b)
	{
		System.out.println("Addition of "+a+","+b+" is "+(a+b));
	}
	Numbers(double a,double b,double c)
	{
		this(a,b);
		System.out.println("Addition of "+a+","+b+","+c+" is "+(a+b+c));
	}
	Numbers(double a,double b,double c,double d)
	{
		this(a,b,c);
		System.out.println("Addition of "+a+","+b+","+c+","+d+" is "+(a+b+c+d));
	}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("MENU\n1.Two Numbers\n2.Three Numbers\n3.four Numbers\n4.Exit");
	System.out.println("Enter your choice :");
	int x=sc.nextInt();
	switch(x)
	{
	case 1:
		System.out.println("Enter two numbers for addition");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		Numbers n=new Numbers(a,b);
		break;
	case 2:
		System.out.println("Enter three numbers for addition");
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		Numbers n1=new Numbers(c,d,e);
		break;
	case 3:
		System.out.println("Enter four numbers for addition");
		double f=sc.nextDouble();
		double g=sc.nextDouble();
		double h=sc.nextDouble();
		double i=sc.nextDouble();
		Numbers n2=new Numbers(f,g,h,i);
		break;
	case 4:
		break;
	default:
		System.out.println("Enter correct Choise");
	}
	}
}