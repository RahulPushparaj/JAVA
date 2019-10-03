package Practise;

public class ArmStrong 
//153=(1)^3+(5)^3+(3)^3=153
{
	public static void main(String[] args) 
	{
		int n = 153,temp = 153;
		int i = 0,j = 0;
		while (n>0) 
		{
			i = n%10;
			j = (i*i*i)+j;
			n = n/10;
		}
		System.out.println(j);
		if(temp==j)
		{
			System.out.println("It is ArmStrong");
		}
		else
		{
			System.out.println("Not a ArmStrong");
		}
	}
}
