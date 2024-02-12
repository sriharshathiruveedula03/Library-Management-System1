package sample1;
import java.math.BigDecimal;
public class Cosmetics extends Goods 
{
 private boolean isTaxed = true;
 private boolean isImported = false;
 public Cosmetics(String description, int qty, BigDecimal price) 
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
 throw new UnsupportedOperationException("Cosmetics Cannot be imported");
 }
}
