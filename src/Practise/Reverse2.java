package Practise;

public class Reverse2 
{
	public static void main(String[] args) 
	{
		int n=123456789;
		int num = 0,j=0;
		while(n>0)
		{
			num = n%10;
			j=(j*10)+num;
			n=n/10;
		}
		System.out.println(j);
	}
}
