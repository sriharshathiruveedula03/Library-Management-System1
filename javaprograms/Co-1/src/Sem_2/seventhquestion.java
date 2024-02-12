package Sem_2;
public class seventhquestion 
{
	private String name;
	private long mobile;
	private int distance;
	private int fare;
	public boolean setDistance(int d)
	{
		if(d>0)
		{
			distance=d;
			return true;
		}
		else
		{
			return false;
		}
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setMobile(long mobile)
	{
		this.mobile=mobile;
	}
	public String getName()
	{
		return name;
	}
	public long getMobile()
	{
		return mobile;
	}
	public int getDistance()
	{
		return distance;
	}
	public int computeFare()
	{
		fare=distance*10;
		return fare;
	}
	public String toString()
	{
		String 
		s=String.format("NAME=%s\nMOBILE=%d\nDISTANCE=%d\nFARE=%d",getName(),getMobile(),getDistance(),computeFare());
		return s;
	}
}
