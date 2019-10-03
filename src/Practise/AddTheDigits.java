package Practise;

public class AddTheDigits
{
	public static void main(String[] args) 
	{
		String s="abc1456khl";
		String dig = "";
		String let = "";
		
		int digit = 0;
		int letter = 0;
		
		for (int i = 0; i < s.length(); i++) 
		{
			char ch = s.charAt(i);
			if (Character.isDigit(ch))
			{
				dig = dig+ch;
				digit++;
			}
			else
			{
				let = let+ch;
				letter++;
			}
		}
		System.out.println("letter count="+letter);
		System.out.println("digit count="+digit);
		System.out.println("digit="+dig);
		System.out.println("letter="+let);
	}

}


