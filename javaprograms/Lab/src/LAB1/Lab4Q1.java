package LAB1;
import java.util.*;
class Account
{
	private long id;
	private double balance;
	
	public Account()
	{
		id = 0;
		balance = 0;
	}
	public Account(long i,double b)
	{
		id = i;
		balance = b;
	}
	public void setID(long i)
	{
		id = i;
	}
	public void setBalance(double b)
	{
		balance = b;
	}
	public long getID()
	{
		return id;
	}
	public double getBalance()
	{	
		return balance;
	}
	public boolean check()
	{
		if(id>=0&&balance>=0)
			return true;
		else
			return false;
	}
	public void withdraw(double w)
	{
		balance = balance-w;
	}
	public void deposit(double d)
	{
		balance = balance+d;
	}
	public void display()
	{
		System.out.println("Details:\nID:"+id+"\nBalance:"+balance);
	}
}
public class Lab4Q1
{

	public static void main(String[] args)
	{
		int n,c=-1,choice;
		long i;
		double b,deposit,withdraw;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of accounts which can be created at maximum : ");
		n = s.nextInt();
		
		Account[] d = new Account[n];
		while(true)
		{
			System.out.println("MENU:\nOption 1:Create a default Account\nOption 2:Create an account with specified id and balance\nOption 3:Withdraw\nOption"
			+ " 4:Deposit\nOption 5:Check if ID and Balance of an account and check if they're positive"+ "\nOption 6:Get ID for a specified account"
			+ "\nOption 7:Get "+ "the balance for a specific account\nOption 8:Set the ID for a specific account\nOption 9:Set the balance for a specific"
			+ " account\nOption 10:Display the details for "+ "a certain account\nEnter You Choice:");
			
					choice = s.nextInt();
						
					switch(choice)
					{
					case 1 : c++;
					d[c] = new Account();
					System.out.println("A Default Account has been created.");
					break;
					case 2 : c++;
					System.out.println("Enter the id and balance with which the account should be created : ");
					i = s.nextLong();
					b = s.nextDouble();
					d[c] = new Account(i,b);
					System.out.println("An Account has been created with ID:"+i+"Balance:"+b);
					break;
					case 3 : System.out.println("Enter the serial number for the account: ");
					c = s.nextInt();
					System.out.println("Enter the amount to be withdrawn :");
					withdraw = s.nextDouble();
					d[c].withdraw(withdraw);
					System.out.println("The Amount "+withdraw+" has been withdrawed from the account.");
					break;
					case 4 : System.out.println("Enter the serial number for the account: ");
					c = s.nextInt();
					System.out.println("Enter the amount to be deposited :");
					deposit = s.nextDouble();
					d[c].deposit(deposit);
					System.out.println("The Amount "+deposit+" has been deposited from the account.");
					break;
					case 5 : System.out.println("Enter the serial number for the account: ");
					c = s.nextInt();
					if(d[c].check())
						System.out.println("YES");
					else
						System.out.println("NO");
					break;
					case 6 : System.out.println("Enter the serial number for the account: ");
					c = s.nextInt();
					System.out.println("ID :"+d[c].getID());
					break;
					case 7 : System.out.println("Enter the serial number for the account: ");
					c = s.nextInt();
					System.out.println("Balance : "+d[c].getBalance());
					break;
					case 8 : System.out.println("Enter the serial number for the account: ");
					c = s.nextInt();
					i = s.nextLong();
					d[c].setID(i);
					System.out.println("The id:"+i+" for the account has been set.");
					break;
					case 9 : System.out.println("Enter the serial number for the account: ");
					c = s.nextInt();
					b = s.nextDouble();
					d[c].setBalance(b);
					System.out.println("The balance:"+b+" has been set.");
					break;
					case 10 : System.out.println("Enter the serial number for the account : ");
					c = s.nextInt();
					d[c].display();
					break;
					default :System.out.println("The process has been stopped.");
					s.close();
					System.exit(0);
					}
				}
		}
}


