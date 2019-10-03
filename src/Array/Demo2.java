package Array;

public class Demo2 
{
	public static void main(String[] args) 
	{
		System.out.println("********************************************");
		int[] a = {10,20,30,40,50,60,10,5};
		System.out.println("Length:"+a.length);
		System.out.println(a[1]);
		System.out.println(a[(8-1)]);
		System.out.println("Normal Loop");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Enhanced Loop (or) Foreach");
		for(int c:a)
		{
			System.out.println(c);
		}
		System.out.println("********************************************");	
	}
}
