package Practise;

import Loop.ForLoop;

public class StarProgram
{
	public static void main(String args[])
	{
			System.out.println("***************************************");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------");
			for(int i=1 
					;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("---------------------------------------");
			int k=1;
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(k+" ");
					k++;
				}
				System.out.println();
			} 
			System.out.println("---------------------------------------");
			for (int i = 1; i <= 5; i++)
			{
				for (int j = 1; j <= i; j++)
				{
					if ((i==1)||(i==3)||(i==5))
					{
					System.out.print("* ");
					}
					else if (i==2)
					{
						System.out.print("1 ");
						
					}
					else
					{
						System.out.print("2 ");
					}
				}
				System.out.println();
			}
			System.out.println("---------------------------------------");
			for (int i = 1; i <= 5; i++) 
			{
				for (int j = 1; j <= i; j++)
				{
					if ((i==1)||(i==3)||(i==5))
					{
					System.out.print("* ");
					}
					else if (i==2)
					{
						System.out.print(j+" ");
						
					}
					else
					{
						System.out.print(j+" ");
					}
				}
				System.out.println();
			}
			System.out.println("***************************************");
	}
		
}
/*
*
11
**
222
****
33333
*/