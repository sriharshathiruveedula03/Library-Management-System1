package sri;
import java.util.Scanner;

public class ho
{
	private double kg;
	private void convertKgToPounds(double k) 
	{
	this.kg=k;
	System.out.println("After conversion: \n"+ this.kg +" kg =" +(this.kg*2.2046)+" "+"pounds");
	}
	
	public static void main(String[] args)
	{
		
	ho kg=new ho(); 
	Scanner sc=new Scanner (System.in);
	System.out.print(" Enter value in kilogram(S):");
	double n=sc.nextDouble();
	
	kg.convertKgToPounds(n);
	sc.close();
	}
	
}

