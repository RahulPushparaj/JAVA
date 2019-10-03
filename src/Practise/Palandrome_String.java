package Practise;

public class Palandrome_String 
{
	public static void main(String[] args) 
	{
		String A = "madam";
		String B = "";
		for(int i=A.length()-1;i>=0;i--)
		{
			char F = A.charAt(i);
			B = F+B;
		}
		System.out.println(B);
		if(A.equalsIgnoreCase(B))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		System.out.println(A.equalsIgnoreCase(B));
	}
}
