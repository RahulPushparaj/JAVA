package method_overridding;

public class loanaccount extends Account
{
	loanaccount(int accno,double accbal)
	{
		super(accno,accbal);
		System.out.println("Loan Accont creadied sucess");
	}
	void deposiit(double amt)
	{
		System.out.println("Deposit Amount in Loan Account="+amt);
		accbal=accbal-amt;
		System.out.println("Your Current Balance in Loan Account="+accbal);
	}
	void withdraw(double amt)
	{
		System.out.println("Withdraw Amount in Loan Account="+amt);
		accbal=accbal+amt;
		System.out.println("Your Current Balance in Loan Account="+accbal);
	}

}
