package Practise;

public class SortTheBubbles
{
	public static void main(String[] args) 
	{
		int[] a = {10,5,6,7,3,10,20};
		
		for(int i = 0;i<a.length;i++)
		{
			for(int j = i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					int c = a[i];
					a[i] = a[j];
					a[j]=c;
				}
			}
		}
			for(int x:a)
			{
				System.out.println(x);
		}
		}
	}


