package Skill_5;
import java.math.*;
import java.io.*;
interface item
{
  public double getExtendedTax();
  public double getExtendedTaxedPrice();
  public void setImported(boolean b);
  public String getDiscription();
}
interface TaxCalculator
{
  public abstract BigDecimal getCalculatedTax(boolean isTaxable,boolean isImported,BigDecimal price);
}
abstract class Goods implements item,TaxCalculator
{
  String description=getDiscription();
  int qty;
  BigDecimal price;
  double tax;
  public abstract boolean isTaxed();
  public abstract boolean isImported();
  public double getExtendedTax()
  {
    if (description.equalsIgnoreCase("book"))
    {
      tax=0;
    }
    else if (description.equalsIgnoreCase("Cosmetics"))
    {
      tax=0.10*price.doubleValue();
    }
    else if (description.equalsIgnoreCase("CD"))
    {
      tax=(0.15*price.doubleValue());
    }
    return tax;
  }
  public double getExtendedTaxedPrice()
  {
    return Double.valueOf(qty)*(tax+price.doubleValue());
  }
}
class Book extends Goods
{
  String Name;
  boolean isTaxed=false;
  boolean isImported=true;
  public void set(String name,int Qty,BigDecimal Price)
  {
    Name=name; 
    qty=Qty;
    price=Price;
  }
  public String getDiscription()
  {
    return "Book";
  }
  public boolean isTaxed()
  {
    return false;
  }
  public boolean isImported()
  {
    return false;
  }
  public void setImported(boolean imported)
  {
    isImported=imported;
  }
  
  public BigDecimal getCalculatedTax(boolean isTaxable, boolean isImported, BigDecimal price) 
  {
    return null;
  }
  
}
class CD extends Goods
{
  String Name;
  boolean isTaxed=true;
  boolean isImported=true;
  public void set(String name,int Qty,BigDecimal Price)
  {
    Name=name;
    qty=Qty;
    price=Price;
  }
  public String getDiscription()
  {
    return "CD";
  }
  public boolean isTaxed()
  {
    return true;
  }
  public boolean isImported()
  {
    return true;
  }
  public void setImported(boolean imported)
  {
    isImported=imported;
  }
  public BigDecimal getCalculatedTax(boolean isTaxable, boolean isImported, BigDecimal price) 
  {
    return null;
  }
}
class Cosmetics extends Goods
{
  String Name;
  boolean isTaxed=true;
  boolean isImported=false;
  public void set(String name,int Qty,BigDecimal Price)
  {
      Name=name;
    qty=Qty;
    price=Price;
  }
  public String getDiscription()
  {
    return "Cosmetics";
  }
  public boolean isTaxed()
  {
    return true;
  }
  public boolean isImported()
  {
    return false;
  }
  public void setImported(boolean imported)
  {
    isImported=imported;
  }
  public BigDecimal getCalculatedTax(boolean isTaxable, boolean isImported, BigDecimal price) 
  {
    return null;
  }
}

public class Retail {

  public static void main(String[] args) 
  {
    // TODO Auto-generated method stub
      Book m=new Book();
      m.set("Operation Mincemeat",2,BigDecimal.valueOf(499.9));
      System.out.println("BOOK:"+m.Name); 
      System.out.println("TAX:"+m.getExtendedTax());
      System.out.println("Total Price:"+m.getExtendedTaxedPrice());
      System.out.println();
      CD z=new CD();
      z.set("Harry Potter Movie SET",2, BigDecimal.valueOf(599.00));
      System.out.println("CD:"+z.Name); 
      System.out.println("TAX:"+z.getExtendedTax());
      System.out.println("Total Price:"+z.getExtendedTaxedPrice());
      System.out.println();
      Cosmetics k=new Cosmetics();
      k.set("Facial Cream", 2, BigDecimal.valueOf(20.00));
      System.out.println("Cosmetics:"+k.Name); 
      System.out.println("TAX:"+k.getExtendedTax());
      System.out.println("Total Price:"+k.getExtendedTaxedPrice()); 
      System.out.println();
      System.out.println("NET TOTAL:"+(m.getExtendedTaxedPrice()+k.getExtendedTaxedPrice()+z.getExtendedTaxedPrice()));
  }
}