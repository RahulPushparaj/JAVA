package Practise;

public class a2b2c3 
{
	public static void main(String[] args) 
	{
		String s = "a2b2c2";
		char[] arr = s.toCharArray();
		
		for (int i = 1; i < arr.length; i=i+2)
		{
			int n = arr[i]-48;
			
			for (int j = 1; j <=n; j++)
			{
				System.out.println(arr[i-1]);
			}
		}
	}
}
