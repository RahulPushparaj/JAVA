package Practise;

public class Count_Capital_Digit_Small_SplChar
{
	public static void main(String[] args) 
	{
		String a = "abc124def";
		int integer=0,charac=0;
		for (int i = 0; i < a.length(); i++)
		{
			char ch = a.charAt(i);
			if(Character.isDigit(ch))
			{
				integer++;
			}
			else
			{
				charac++;
			}
		}
		System.out.println("Digit="+integer);
		System.out.println("Character="+charac);
	}
}
