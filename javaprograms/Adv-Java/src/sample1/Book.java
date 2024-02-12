package sample1;
import java.math.BigDecimal;
public class Book extends Goods 
{
private boolean isTaxed = false;
private boolean isImported = false;
public Book(String description, int qty, BigDecimal price) 
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
 throw new UnsupportedOperationException("Books Cannot be imported");
}
}