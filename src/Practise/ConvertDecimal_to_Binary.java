package Practise;

public class ConvertDecimal_to_Binary
{
	public static void main(String[] args) 
	{
		int num = 8;
		int rem = 0;
		String s = "";
		while(num>0)
		{
			rem = num%2;
			s = s + rem;
			num = num/2;
		}
		System.out.println(new StringBuffer(s).reverse());
	}
}
