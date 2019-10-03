package Practise;

public class Print_vowels_nonVowels 
{
	public static void main(String[] args) 
	{
		String s = "pushparaj";
		int vowel = 0;
		int nonvowel = 0;
 		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'))
			{
				vowel++;
			}
			else 
			{
				nonvowel++;
			}
		}
		System.out.println(vowel);
		System.out.println(nonvowel);
	}

}
