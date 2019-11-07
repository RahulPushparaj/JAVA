package Practise;

public class Convert_StringtoInteger
{
	public static void main(String[] args) 
	{
		String s1 = "444";
		String s2 = "555";
		
		int v1 = Integer.valueOf(s1);
		int v2 = Integer.parseInt(s2);
		
		int a = v1+v2;
		System.out.println(a);
	}

}
