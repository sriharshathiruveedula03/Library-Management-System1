package sri;
import java .util.*;
class Student 
{
  int rollno,marks,i;
  String name;
  public void dispay(Student o[],int i)
  {
    System.out.println("Student "+(i+1)+" :");
    
    System.out.println("Name: "+o[i].name);
    System.out.println("Roll number: "+o[i].rollno);
    System.out.println("Marks: "+o[i].marks);
  }
}
public class Students 
{
     public static void main(String args[]) 
     {  
       int n;
       
       Scanner p=new Scanner(System.in);
       
       System.out.print("No.of students: ");
       n=p.nextInt();
       
       Student[] s=new Student[n];
       
       for(int i=0;i<n;i++)
       {
         s[i]=new Student();
       }
       
       for(int i=0;i<n;i++) 
       {
         System.out.println("Enter details of student "+(i+1));
         
         System.out.print("Name: ");
         s[i].name=p.next();
         
         System.out.print("Roll number: ");
         s[i].rollno=p.nextInt();
         
         System.out.print("Marks: ");
         s[i].marks=p.nextInt();
         
       }
       for(int i=0;i<n;i++)
       {
         s[i].dispay(s, i);
       }
       p.close();
     }
}
