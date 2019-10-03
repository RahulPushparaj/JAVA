package Practise;

public class LargestElementInAnArray 
{
	public static void main(String[] args) 
	{
		int a [] = {22,7,30,29,62};
		int max = 0;
		for (int i = 0; i < a.length; i++) 
		{
			if (a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Largest Element="+max);
	}
}
