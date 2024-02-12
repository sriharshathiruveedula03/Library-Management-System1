package Co_01;
class wednesday
{
	int a,b;
	public void setvalue(int A,int B)
	{
		a=A;
		b=B;	
	}
	public String toString()
	{
		return "result="+a*b;
	}
}
public class Getter_Setter
{

	public static void main(String[] args) 
	{
		wednesday w=new wednesday();
		w.setvalue(10, 90);
		System.out.println(w);
	}

}
