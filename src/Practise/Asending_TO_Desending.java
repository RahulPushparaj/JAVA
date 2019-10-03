package Practise;

public class Asending_TO_Desending
{
	public static void main(String[] args) 
	{
		int[] a = {3,7,8,17,12,5};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int c = a[i];
					a[i] = a[j];
					a[j] = c;	
				}
				else 
				{
					
				}
				
			}
		}
	for(int x:a)
	{
		System.out.println(x);
		
	}
	
	}
}
