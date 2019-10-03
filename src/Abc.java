
public class Abc 
{
	public static void main(String[] args)
	{
		int num = 123,sum=0,push=num;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem*rem*rem;
			num=num%10;
		}
		if(push==sum)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
}
