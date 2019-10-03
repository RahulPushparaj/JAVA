package method_overridding;

public class Account 
{
	int accno;
	double accbal;
	Account(int accno,double accbal)
	{
		this.accno=accno;
		this.accbal=accbal;
		System.out.println("Acc created sucess..............");
	}
	void deposit(double amt)
	{
		System.out.println("Dummy 1.........................");
	}
	void withdraw(double amt)
	{
		System.out.println("Dummy 2.........................");
	}
	final void balanceenquiry()
	{
		System.out.println("Your Acc bal="+accbal);
	}
}