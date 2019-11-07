package Practise;

public class No_of_Accurancy2 
{
	public void add() {
		int[] a = {1,2,1,6,4,3,5,4,4,1,6};
		int b = 1;
		int B = 0;
		int c = 2;
		int C = 0;
		int d = 6;
		int D = 0;
		int e = 4;
		int E = 0;
		int f = 3;
		int F = 0;
		int g = 5;
		int G = 0;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i]==b) 
			{
				B++;
			}
			else if (a[i]==c)
			{
				C++;
			}
			else if (a[i]==d) 
			{
				D++;
			}
			else if (a[i]==e) 
			{
				E++;
			}
			else if (a[i]==f) 
			{
				F++;
			}
			else if (a[i]==g) 
			{
				G++;
			}
		}
		System.out.println("1 is Accuring in "+B+" times");
		System.out.println("2 is Accuring in "+C+" times");
		System.out.println("6 is Accuring in "+D+" times");
		System.out.println("4 is Accuring in "+E+" times");
		System.out.println("3 is Accuring in "+F+" times");
		System.out.println("5 is Accuring in "+G+" times");
	}
	public void sub()
	{
		int[] a = {1,1,6,4,3,5,4,4,1,6};
		for(int i = 0;i<a.length;i++)
		{
			if (a[i]!=0)
			{
				int ele = a[i];
				int count = 0;
				for (int j = i; j < a.length; j++) 
				{
					if (a[j]==ele)
					{
						count++;
						a[j]=0;
					}
				}
				System.out.println(ele+" is Accured "+count+" times");
			}
		}
	}
	public static void main(String[] args) 
	{
		No_of_Accurancy2 Driver = new No_of_Accurancy2();
		System.out.println("      BIG PROGRAM");
		Driver.add();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("      SMALL PROGRAM");
		Driver.sub();
	}
	
}
