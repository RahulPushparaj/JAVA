package Loop;


public class ForLoop
{

public static void main(String args[])
{
		System.out.println("***************************************");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print("x ");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("x ");
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
		System.out.println("***************************************");
	}
  
}
