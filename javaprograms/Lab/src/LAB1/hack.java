package LAB1;
import java.util.*;
import java.lang.*;
import java.io.*;
public class hack 
{
	 public static void main (String[] args) throws java.lang.Exception
	 {
	
	  Scanner sc = new Scanner(System.in);
	  int t = sc.nextInt();
	  while(t-->0)
	  {
	      int g = sc.nextInt();
	      int v = sc.nextInt();
	      System.out.println((v*v)/(2*g));
	  }
	 }
}
