package DsCo_1;
import java.util.Scanner;
public class Conversion_infix_to_postfix  
{
  static char a[]=new char[1000];
  static int top=-1;
  public static void push(char ch)
  {
    top++;
    a[top]=ch;
  }
  public static char pop()
  {
    return a[top--];
  }
  
  public static int priority(char ch) 
  {
    if(ch=='^') 
    {
      return 3;
    }
    if(ch=='*' || ch=='/' || ch=='%')
    {
      return 2;
    }
    if(ch=='+' || ch=='-')
    {
      return 1;
    }
    else 
    {
      return 0;
    }
  }
  public static void main(String[] args)
  {
    System.out.print("Enter Infix Expression: ");
	String infix;
    Scanner s=new Scanner(System.in);
    infix=s.next();
    
    String postfix=" "; 
    
    
    for(int i=0; i<infix.length(); i++) 
    {
    	char ch;
      ch=infix.charAt(i);
      if(Character.isLetterOrDigit(ch))
      {
        postfix=postfix+ch;
      }
      else if(ch=='(')
      {
        push(ch);
      }
      else if(ch=='*' || ch=='/' || ch=='%' || ch=='^' || ch=='+' || ch=='-')
      {
        while((top!=-1) && (priority(ch) <= priority(a[top])))
        {
          postfix=postfix+pop();
        }
        push(ch);
      }
      else if(ch==')')
      {
        char chr;
        chr=pop();
        while(chr!='(') 
        {
          postfix=postfix+chr;
          chr=pop();
        }
      }
    }
    while(top!=-1)
    {
      postfix=postfix+pop();
    }
    System.out.print("PostFix Expression: "+postfix);
    s.close();
  }
}

