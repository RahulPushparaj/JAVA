package method_overridding;

public class mainclass16 
{
	public static void main(String[] args)
	{
		System.out.println("**********************************************");
		savingaccount sa1=new savingaccount(1234,50000.0);
		sa1.balanceenquiry();
		sa1.deposit(3000.0);
		sa1.withdraw(2000.0);
		System.out.println("--------------------------------------");
		loanaccount la1=new loanaccount(4567,60000.0);
		la1.balanceenquiry();
		la1.deposit(4444.0);
		la1.withdraw(5555.0);
		System.out.println("**********************************************");
	}
}
