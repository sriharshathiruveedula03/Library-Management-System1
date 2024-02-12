package sample1;
import java.math.BigDecimal;

public abstract class Goods implements Item
{
    private String description;
    private int qty;
    private BigDecimal price;
    private TaxCalculator tax = new TaxCalculatorlmpl();

    public Goods(String description, int qty, BigDecimal price)
    {
        this.description = description;
        this.qty = qty;
        this.price = price;
    }

    protected abstract boolean isTaxed();

    protected abstract boolean isImported();

    public double getExtendedTax()
    {
        BigDecimal calculatedTax = tax.getCalculatedTax(isTaxed(),isImported(), price);
        BigDecimal extTax = calculatedTax.multiply(BigDecimal.valueOf(qty));
        return extTax.doubleValue();
    }

    public double getExtendedTaxedPrice()
    {
        if (tax == null)
        {
            throw new IllegalArgumentException("Tax should be calculated first:");
        }

        BigDecimal calculatedTax = tax.getCalculatedTax(isTaxed(), isImported(), price);
        BigDecimal extPrice = BigDecimal.valueOf(qty).multiply(calculatedTax.add(price));
        return extPrice.doubleValue();
    }

    public String getDescription()
    {
        return description;
    }

    public String toString()
    {
        return qty + " " + description + " : ";
    }
}
