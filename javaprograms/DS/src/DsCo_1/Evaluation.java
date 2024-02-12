package DsCo_1;
import java.util.Scanner;
public class Evaluation
{
  static int a[]=new int[100];
  static int top=-1;
  public static void push(int num) 
  {
    top++;
    a[top]=num;
  }
  public static int pop()
  {
    return a[top--];
  }
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Postfix: ");
    String postfix;
    postfix=s.next();
    
    for(int i=0; i<postfix.length(); i++) 
    {
      char c;
      c=postfix.charAt(i);
      if(Character.isLetter(c)) 
      {
        System.out.print("Enter "+c+" value: ");
        int num=s.nextInt();
        push(num);
      }
      else if(c=='*' || c=='+' || c=='-' || c=='/' || c=='%' || c=='^')
      {
        int m=pop();
        int n=pop();
        
        switch(c)
        {
        case '+' : push(n+m);
        break;
        
        case '-' : push(n-m);
        break;
        
        case '*' : push(n*m);
        break;
        
        case '/' : push(n/m);
        break;
        
        case '%' : push(n%m);
        break;
        
        default: System.out.println("Invalid Choice.");
        }
      }
    }
    System.out.println("Result: "+pop());
    s.close();
  }
}