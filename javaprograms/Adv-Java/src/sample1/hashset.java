package sample1;//skill-6
import java.util.*;
import java.util.Set;
import java.util.*;
class Employees
{
  String name;
  public Employees(String name)
  {
    this.name=name;
  }
  public String toString()
  {
    return name;
  }
}
public class hashset
{
  public static void main(String[] args)
  {
    HashMap<String,Employees> m=new HashMap<String,Employees>();
    m.put("121",new Employees("Ram"));
    m.put("100",new Employees("Ravi"));
    m.put("101",new Employees("Kumar"));
    System.out.println("Before modification: ");
    System.out.println(m);
    m.forEach((k,v)->System.out.println(k+" "+v));
    System.out.println("After modification: ");
    m.remove("100");
    m.replace("101",new Employees("Harsha")); 
    System.out.println(m);
    m.forEach((k,v)->System.out.println(k+" "+v));
  }
}