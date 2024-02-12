package sample1;

import java.math.BigDecimal;
public interface TaxCalculator 
{
 abstract BigDecimal getCalculatedTax(boolean isTaxable, boolean isImported, BigDecimal price);
}
