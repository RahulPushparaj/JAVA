package Practise;

public class First_Letter_Capital 
{
	public static void main(String[] args) {
		String s = "first letter is capital";
		String s1 = "";
		String[] sp = s.split(" ");
		
		for (String D : sp) 
		{
			char L = D.charAt(0);
			char ch = Character.toUpperCase(L);
			s1=s1+ch+D.substring(1)+" ";
		}
		System.out.println(s1);		
	}

}
