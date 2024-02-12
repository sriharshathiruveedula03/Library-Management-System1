package sample1;
import java.util.*;
import java.util.*;

class Product {
  int id;
  String name;
  int price;
  public Product(int i,String n,int p) {
    this.id=i;
    this.name=n;
    this.price=p;
  }
  public int getid() {
    return(this.id);
  }
  public String getname() {
    return(this.name);
  }
  public int getprice() {
    return(this.price);
  }
  public String toString() {
    String
    s=String.format("name:%s%nid:%d%nprice:%d\n",getname(),getid(),getprice());
    return s;
  }
}
class Mobile extends Product {
  int ram;
  String os;
  int memory;
  public Mobile(int i,String n,int p) {
    super(i,n,p);
  }
  public void Mobile(int r,String os,int m) {
    this.ram=r;
    this.os=os;
    this.memory=m;
  }
  public int getram() {
    return(this.ram);
  }
  public String getos() {
    return(this.os);
  }
  public int getmemory() {
    return(this.memory);
  }
  public String toString() {
    String
    s=String.format("name:%s%nid:%d%nprice:%d\nram:%d%nos:%d%nmemory:%d%n",getname(),getid(),getprice(),getram(),getos(),getmemory());
    return s;
  }
}
class LEDTv extends Product {
  public LEDTv(int i, String n, int p) {
    super(i, n, p);
  }
  String name1;
  int size;
  public void LEDTv(String n1,int s) {
    this.name=n1;
    this.size=s;
  }
  public String getname1() {
    return(this.name1);
  }
  public int getsize()
  {
    return(this.size);
  }
  public String toString()
  {
    String
    s=String.format("name:%s%nid:%d%nprice:%d\nname:%d%nsize:%d%n",getname(),getid(),getprice(),getname1(),getsize());
    return s;
  }
}
public class skill_1 {
  public static void main(String args[]) {
    System.out.println("TELEVISION DETAILS ");
    Scanner sc=new Scanner(System.in);
    System.out.println("enter Product id ");
    int id=sc.nextInt();
    System.out.println("enter Product Name ");
    String name=sc.next();
    System.out.println("enter Product price ");
    int price=sc.nextInt();
    System.out.println("enter model name ");
    String name1=sc.next();
    System.out.println("enter size ");
    String size=sc.next();
    System.out.println("MOBILE DETAILS");
    LEDTv t=new LEDTv(id, name,price);
    System.out.println("enter Product id ");
    id=sc.nextInt();
    System.out.println("enter Product Name ");
    name=sc.next();
    System.out.println("enter Product price ");
    price=sc.nextInt();
    System.out.println("enter RAM ");
    int ram=sc.nextInt();
    System.out.println("enter OS ");
    String os=sc.next();
    System.out.println("enter internal memory ");
    int m=sc.nextInt();
    Mobile m1=new Mobile(id, name,price);
    System.out.println(t);
    System.out.println(m1);
    sc.close();
  }
}