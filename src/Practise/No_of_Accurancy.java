package Practise;

public class No_of_Accurancy 
{
	/*
	public static void main(String[] args) 
	{
		int[] a = {1,2,1,6,4,3,5,4};
		int e = 5;
		int count = 0;
		for (int x : a)
		{
			if(x==e)
			count++;
		}
		System.out.println("e its accured="+count);
		
	}
	*/
	public static void main(String[] args) 
	{
		int[] a = {1,2,1,6,4,3,1,5,4};
		//int e =1;
		int count = 0;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==1) 
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
