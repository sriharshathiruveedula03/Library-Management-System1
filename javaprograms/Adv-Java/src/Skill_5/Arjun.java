package Skill_5;
import java.util.Scanner;
class products
{
  int id,price;
  String name;
}
class ledtv extends products
{
  int inches;
  String brand;
  public void update_tv()
  {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter Brand");
    brand=s.next();
    System.out.println("Enter Size");
    inches=s.nextInt();
  }
  public void view_tv()
  {
    System.out.println("Product Name:"+name);
    System.out.println("Product ID:"+id);
    System.out.println("Product Brand:"+brand);
    System.out.println("Product Size:"+inches);
    System.out.println();
  }
}
class mobile extends products
{
  int ram,mem;
  String os;
  public void update_mob()
  {
    Scanner l=new Scanner(System.in);
    System.out.println("Enter Ram");
    ram=l.nextInt();
    System.out.println("Enter Internal Memory Storage");
    mem=l.nextInt();
    System.out.println("Enter OS");
    os=l.next();
  }
  public void view_mob()
  {
    System.out.println("Name:"+name);
    System.out.println("ID:"+id);
    System.out.println("OS:"+os);
    System.out.println("Ram:"+ram+" GB");
    System.out.println("Internal Memory:"+mem+" GB");
    System.out.println("Price:"+price);
  }
}
public class Arjun 
{
  public static void main(String[] args) 
  {
    int i,j,z=0,x=0;
    // TODO Auto-generated method stub
         mobile[] b=new mobile[15];
         for (i=0;i<15;i++)
         {
           b[i]=new mobile();
           b[i].id=20;
           b[i].price=30000;
           b[i].name="Smart Phone";
         }
        ledtv[] a=new ledtv[15];
          for (i=0;i<15;i++)
          {
            a[i]=new ledtv();
            a[i].id=10;
            a[i].price=50000;
            a[i].name="Smart-TV";
          }
          Scanner f=new Scanner(System.in);
          z=0;
          x=0;
          while (true)
          {
          System.out.println("Enter 1 to update tv details");
          System.out.println("Enter 2 to view TV details");
          System.out.println("Enter 3 to update phone details");
          System.out.println("Enter 4 to view phone details");
            j=f.nextInt();
            switch(j)
            {
            case 1:a[z].update_tv();
                   z++;
                   break;
            case 2:for (int p=0;p<z;p++)
                   {
                     a[p].view_tv();
                   }
                   break;
            case 3: b[x].update_mob();
                    x++;
                    break;
            case 4: for (int e=0;e<x;e++)
                    {
                   b[e].view_mob();  
                    }
                    break;
            default:System.exit(0);        
              }
          }    
  }
}