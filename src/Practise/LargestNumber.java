package Practise;

public class LargestNumber
{
	public static void main(String[] args) 
	{
		int[] a = {5,6,7,12,3,8};
		int max = a[1];
		for(int i =0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println(max);
	}

}
