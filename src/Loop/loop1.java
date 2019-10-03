package Loop;

//to check given num is prime or not.
public class loop1 
{   
	static int isdprime(int num)
	{
		int count = 0; 
		for(int i=1;i<=num;i++)
		{ 
			if(num%i==0)
			{
				count++;
				if(count>2)
				{
					break;
				}
			}
		}
		if(count==2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static void main(String args[])
	{	
		System.out.println("***************************************");
		int count = 0;
		for(int num=100;num<=1000;num++)
		{
			if(isdprime(num)==1)
			{
				count++;
			}
		}
		System.out.println("count of prime="+count);

			System.out.println("***************************************");
	 }

}
   