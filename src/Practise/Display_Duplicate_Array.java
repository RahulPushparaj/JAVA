package Practise;

public class Display_Duplicate_Array 
{
	public static void main(String[] args) 
	{
		int a[] = {9,2,8,1,6,4,3,5,8,9,4,9,5};
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]!=0)
			{
				int ele = a[i];
				int count = 0;
				for (int j = i; j < a.length; j++)
				{
					if(ele==a[j])
					{
						count++;
						a[j]=0;
					}
				}
				if(count>1)
					System.out.println(ele);
			}
		}
	}
}
