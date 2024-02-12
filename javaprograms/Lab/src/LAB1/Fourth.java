package LAB1;
import java .util.*;
class Student
{
long id;
String name,gender,department;
public void setValues(long i,String n,String g,String d)
{
id = i;
name = n;
gender = g;
department = d;
}
public String toString()
{
return "ID: "+id+"\nName: "+name+"\nGender: "+gender+"\nDepartment:"+department;
}
}
public class Fourth {
public static void main(String[] args) {
long id;
String name,gender,department;
Student a = new Student();
Student b = new Student();
Scanner s = new Scanner(System.in);
id = s.nextLong();
s.nextLine();
name = s.nextLine();
gender = s.nextLine();
department = s.nextLine();
a.setValues(id, name, gender, department);
id = s.nextLong();
s.nextLine();
name = s.nextLine();
gender = s.nextLine();
department = s.nextLine();
b.setValues(id, name, gender, department);
System.out.println("Enter name:"+a);
System.out.println("Enter name:"+b);
s.close();
}
}



