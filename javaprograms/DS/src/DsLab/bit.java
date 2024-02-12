package DsLab;
//CHARACTER COUNT
import java.util.Scanner;
import java.io.*;
public class bit
{

public static void main(String[] args) 
{
  // TODO Auto-generated method stub
  Scanner k=new Scanner(System.in);
      System.out.print("enter a string\t");
      String str=k.next();
      Character c = new Character(str.charAt(0));
      String s = c.toString();
      int p = Integer.parseInt(s);
      int i;
      int m=str.length();
      for(i=0;(p+i)<=m;)
      {
          if(p==((str.substring(i,p+i).length())))
          {
             
              Character c1 = new Character(str.charAt(p));
               String s1 = c1.toString();
              i+=p;
              p=Integer.parseInt(s1);
          }
      }
      if(i==m)
      {
          System.out.println("the bits are received correctly");
      }
      else
      {
          System.out.println("not received correctly");
      }
}

}