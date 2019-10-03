package Practise;

public class Count_Capital_Digit_Small_SplChar
{
	public static void main(String[] args) 
	{
		String a = "welcome to 567 1.@#%*@ PUSH";
		int capital=0,small=0,digit=0,charac=0;
		for (int i = 0; i < a.length(); i++)
		{
			char ch = a.charAt(i);
			if(Character.isUpperCase(ch))
			{
				capital++;
			}
			else if(Character.isDigit(ch))
			{
				digit++;
			}
			else if (Character.isLowerCase(ch))
			{
				small++;
			}
			else
			{
				charac++;
			}
		}
		
		
		System.out.println("Capital Letter="+capital);
		System.out.println("Small Letter="+small);
		System.out.println("Digit="+digit);
		System.out.println("Special Character="+charac);
	}

}
