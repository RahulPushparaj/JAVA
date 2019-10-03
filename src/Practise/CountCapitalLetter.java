package Practise;

public class CountCapitalLetter 
{
	 public static void main(String[] args) 
	 {
		 String s = "PUSHparaj";
		 int capital = 0;
		 for(int i = 0;i<s.length();i++)
		 {
			 char ch = s.charAt(i);
			 if(Character.isUpperCase(ch))
			 {
				 capital++;
			 }
		 }
		 System.out.println(capital);
		 
	}

}
