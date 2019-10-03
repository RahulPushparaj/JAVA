package Practise;

public class SmallestNumber 
{
	public static void main(String[] args) 
	{
		int[] a = {5,6,7,12,3,8};
		int b = a[0];
		for(int i =0;i<a.length;i++)
		{
			if(a[i]<b)
			{
				b=a[i];
			}		
		}
		System.out.println(b);
	}
}
