package DsCo_1;
import java.util.Scanner;
public class Brackets 
{
  static char a[]=new char[100];
  static int top=-1;
  public static void push(char c) 
  {
    top++;
    a[top]=c;
  }
  public static void main(String[] args)
  {
	  
	  String expression;
	System.out.print("Enter a expression: ");
    Scanner s=new Scanner(System.in);
    expression=s.next();
    
    int f=0;
    
    for(int i=0; i<expression.length(); i++) 
    {
      char c=expression.charAt(i);
      
      if(c=='*' || c=='+' || c=='-' || c=='/' || c=='%' || c=='^' ||Character.isLetterOrDigit(c))
      {
        continue;
      }
      else if(c=='(' || c=='{' || c=='[')
      {
        push(c);
      }
      else if((c==')' && a[top]=='(') || (c=='}' && a[top]=='{') || (c==']' && a[top]=='['))
      {
        top--;
      }
      else 
      {
        f++;
        break;
      }
    }
    if( f==0 && top==-1 ) 
    {
      System.out.println("Valid Expression");
    }
    else
    {
      System.out.println("Invalid Expression");
    }
  }
}