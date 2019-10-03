package Type_Casting;
/*
public class primitive
{
	public static void main(String[] args)
	{
		System.out.println("*****************************************");
		byte b=20;
		//int x=(int)b;//Explicit Widening.
		//int x=b;//Implicit Widening.
		char ch='A';
		//int x=ch;//Implicit Widening.
		int i = 33;
		//double x=i;
		double d=22.9999;
		int x =(int)d;//Narrowing(Explicity)
		System.out.println(x);
		System.out.println("*****************************************");
	}
}
*/
public class primitive 
{
	public static void main(String[] args)
	{
		System.out.println("******************************************");
		byte x=20;
		test(x);
		System.out.println('A');
		System.out.println('A'+'A');
		char ch='A';
		//ch++;
		//ch=(char)(char+);
		System.out.println(ch);
		//for(char ch1 = 'A';ch = 5;ch1++)
		{
			System.out.println("ch1");
		}
		System.out.println("******************************************");
	}
	static void test(double x)
	{
		System.out.println("I am in test="+x);
	}
}