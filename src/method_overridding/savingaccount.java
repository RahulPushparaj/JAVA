package method_overridding;

public class savingaccount extends Account
{
	savingaccount(int accno,double accbal)
	{
		super(accno,accbal);
		System.out.println("Saving Accont creadied sucess");
	}
	void deposiit(double amt)
	{
		System.out.println("Deposit Amount in Saving Account="+amt);
		accbal=accbal+amt;
		System.out.println("Your Current Balance in Saving Account="+accbal);
	}
	void withdraw(double amt)
	{
		System.out.println("Withdraw Amount in Saving Account="+amt);
		accbal=accbal-amt;
		System.out.println("Your Current Balance in Saving Account="+accbal);
	}

}
