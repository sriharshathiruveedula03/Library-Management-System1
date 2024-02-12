package Co_01;
class book
{
	long isbn;
	String title;
	double price;
	private void hai(long Isbn,String Title,double Price)
	{
		isbn=Isbn;
	    title=Title;
		price=Price;
	}
	public void setvalue()
	{
	isbn=9575;
	title=" harsha";
	price=675;
	}
	public  String toString()
	{
		String k="\n"+isbn+"\n"+title+"\n"+price;
		return k;
	}
}
public class ToString
{
	public static void main(String[] args) 
	{
		
		book j=new book();
		j.setvalue();
		System.out.println(j);

	}

}
