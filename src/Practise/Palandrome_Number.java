package Practise;

public class Palandrome_Number
{
	public static void main(String[] args) 
	{
		int n =141,temp=141;
		int no = 0,noo = 0;
		while(n>0)
		{
			no = n%10;
			noo = (noo*10)+no;
			n = n/10;
		}
		System.out.println(noo);
		if(temp==noo)
		{
			System.out.println("YES,It is Palandrome");
		}
		else
		{
			System.out.println("NO,It is not a Palandrome");
		}
	}
}
