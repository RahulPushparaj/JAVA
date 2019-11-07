package Practise;

public class SecondLargestNumber
{
	public static void main(String[] args) 
	{
		int[] a = {10,5,6,7,3,2,35,20};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i] < a[j])
				{
					int c = a[i];
					a[i] = a[j];
					a[j]=c;
				}
			}
		}
			System.out.println("Second Largest Number="+a[1]);
		}
	}