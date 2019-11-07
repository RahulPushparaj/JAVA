package Practise;


public class LoopProgram
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
			System.out.println("-------------------11111-------------------");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("-------------------22222-------------------");
			for(int i=1 
					;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
			System.out.println("-------------------33333-------------------");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			System.out.println("-------------------44444-------------------");
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
			System.out.println("-------------------55555-------------------");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if (i==1||i==5||j==1||j==5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("-------------------66666-------------------");
			for(int i=1;i<=5;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if (i==j||i+j==6)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}		
			System.out.println("-------------------77777-------------------");
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=4;j++)
				{
					if ((i==1&&j==1)||(i==1&&j==4))
					{
						System.out.print("G ");
					}
					else if ((i==2&&j==2)||(i==2&&j==3)) 
					{
						System.out.print("O ");
					}
					else if ((i==3&&j==2)||(i==3&&j==3)) 
					{
						System.out.print("p ");
					}
					else if ((i==4&&j==1)||(i==4&&j==4)) 
					{
						System.out.print("I ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("-------------------88888-------------------");
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=4;j++)
				{
					if ((i==j)||(i==1&&j==4))
					{
						System.out.print("G ");
					}
					else if ((i==j)||(i==2&&j==3)) 
					{
						System.out.print("O ");
					}
					else if ((i==3&&j==2)||(i==j)) 
					{
						System.out.print("p ");
					}
					else if ((i==4&&j==1)||(i==j)) 
					{
						System.out.print("I ");
					}
					else
					{
						System.out.print("  ");
					}
				}
				System.out.println();
			}
			System.out.println("-------------------88888-------------------");
			for(int i=1;i<=4;i++)
			{
				for(int s=4;s>i;s--)
				{
					System.out.print("  ");
				}
				for(int j = 1;j <= 2*i-1;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("-------------------99999-------------------");
			int k1 =1;
			for(int i=1;i<=9;i++)
			{
				for(int j=1;j<=5;j++)
				{
					if(i==1||j==1||i==5||j==5||i==9)
					{
						System.out.print("*");
					}
					else if(i>5)
					{
						System.out.print(k1+"");
						k1++;
					}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			System.out.println("-------------------11111-------------------");
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
			System.out.println("-------------------22222-------------------");
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
