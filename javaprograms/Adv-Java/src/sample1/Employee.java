package sample1;

public class Employee {
private String name;
 private double salary;
 public Employee(String n)
 {
 name = n;
 salary = 0;
 }
 public String toString()
 {
 String s="Name - "+name+", Salary - "+salary; 
 
 return s;
}
}