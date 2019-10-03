package Java_Relationship;

public class Inheritance //Test1
{
	int p=10;
	void m1()
	{
		System.out.println("m1 is 10");
	}
}
class Test2 extends Inheritance
{
	int q=20;
	void m2()
	{
		System.out.println("m2 is 20");
	}
}
class Test3 extends Test2
{
	int r =30;
	void m3()
	{
		System.out.println("m3 is 30");
	}
}
class mainclass12
{
	public static void main(String[] args)
	{
		Inheritance a1=new Inheritance();
		System.out.println(a1.p);
		a1.m1();
		
		Test2 a2=new Test2();
		System.out.println(a1.p);
		System.out.println(a2.q);
		a2.m1();
		a2.m2();
		
		Test3 a3=new Test3();
		System.out.println(a1.p);
		System.out.println(a2.q);
		System.out.println(a3.r);
		a3.m1();
		a3.m2();
		a3.m3();
		
	}
}