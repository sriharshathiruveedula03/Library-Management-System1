package sample1;

import java.math.BigDecimal;
public class CD extends Goods 
{
private boolean isTaxed = true;
private boolean isImported = false;
public CD(String description, int qty, BigDecimal 
price) 
{
super(description, qty, price);
}
 public boolean isTaxed() 
 {
 return isTaxed;
}
 public boolean isImported() 
 {
 return isImported;
}
public void setImported(boolean b) 
{
 isImported = b;
}
}