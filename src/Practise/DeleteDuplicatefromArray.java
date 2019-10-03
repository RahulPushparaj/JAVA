package Practise;

import java.util.Arrays;

public class DeleteDuplicatefromArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,1,6,4,3,5,4,1};
		for (int i = 0; i < a.length; i++) 
		{
			int ele = a[i];
			if(ele!=0)
			{
				for(int j = i+1; j < a.length; j++)  
				{
					if(ele==a[j])
					{
						int pos = j;
						for(int k = pos; k < a.length-1; k++)
						{
							a[k] = a[k+1];
						}
						a[a.length-1]=0;
					}
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}