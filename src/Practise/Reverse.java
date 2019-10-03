package Practise;

public class Reverse 
{
	public static void main(String[] args) 
	{
		System.out.println("*************************************");
		String A = "my name is purnachandran";
		String B = "";
		System.out.println(A);
		for(int i = A.length()-1;i>=0;i--)
		{
			char c=A.charAt(i);
			B=B+c;
		}
		System.out.println(B);
		System.out.println(A.length());
		System.out.println(A.charAt(8));
		System.out.println("*************************************");
	}
}

