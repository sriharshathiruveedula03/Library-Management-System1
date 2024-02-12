package sample1;
import java.math.BigDecimal;
public class TaxCalculatorlmpl implements TaxCalculator 
{
 public static final BigDecimal SALES_TAX = BigDecimal.valueOf(0.10); 
 public static final BigDecimal IMPORT_TAX = BigDecimal.valueOf(0.05); 
 public BigDecimal getCalculatedTax(boolean isTaxable, 
boolean isImported, BigDecimal price) 
 {
 if(price == null)
 {
 throw new IllegalArgumentException("Price cannot be null");
 }
 BigDecimal salesTax = BigDecimal.ZERO;
 BigDecimal importTax = BigDecimal.ZERO;
 if (isTaxable) 
 {
 salesTax = price.multiply(SALES_TAX);
 }
 if (isImported) 
 {
 importTax = price.multiply(IMPORT_TAX);
 }
 return salesTax.add(importTax);
 }
}