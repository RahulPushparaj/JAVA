package Practise;

public class Reverse3 
{
	public static void main(String[] args) 
	{
		int i =123;
		int a=0;
		while(i>0)
		{
			a=i%10;
			a=(a*0)+a;
			i=i/10;
		}
		
		System.out.println(a);
	}

}
