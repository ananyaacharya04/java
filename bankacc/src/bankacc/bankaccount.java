package bankacc;

public class bankaccount {
	int acno;
	String name;
	String type;
	int bal;
	bankaccount()
	{
		System.out.println("default constructor is called ");
	}
	bankaccount(int a,String b,String c,int d)
	{
		acno=a;
		name=b;
		type=c;
		bal=d;
	}
	void deposit(int x)
	{
		System.out.println("balance before deposit is"+bal);
		bal=bal+x;
		System.out.println("balance after deposit is"+bal);
	}
	void withdraw(int x)
	{
		System.out.println("balance before withdraw is"+bal);
		bal=bal-x;
		if(bal<0)
		{
				System.out.println("withdrawal not possible");
		}
		
		System.out.println("balance after withdrawal is"+bal);
	}
	void display()
	{
		System.out.println("name"+name);
		System.out.println("balance"+bal);
	}
}
	