package sample1;//skill-5
import java.math.BigDecimal;
public class SimpleShoppingCart 
{
 public static void main(String[] args) 
 {
 Book book1 = new Book("Java Basics", 2, BigDecimal.valueOf(39.95));
 System.out.println(book1.getExtendedTax());
 System.out.println(book1.getExtendedTaxedPrice());
 CD cd1 = new CD("Java in 30 Days", 2, BigDecimal.valueOf(59.00));
 System.out.println(cd1.getExtendedTax());
 System.out.println(cd1.getExtendedTaxedPrice());
 Cosmetics cosmetics1 = new Cosmetics("Facials", 2, BigDecimal.valueOf(20.00));
 System.out.println(cosmetics1.getExtendedTax());
 
System.out.println(cosmetics1.getExtendedTaxedPrice());
 CD cd2 = new CD("Hadoop in 30 Days", 2, BigDecimal.valueOf(10.00));
 cd2.setImported(true);
 System.out.println(cd2.getExtendedTax());
 System.out.println(cd2.getExtendedTaxedPrice());
 }
}
