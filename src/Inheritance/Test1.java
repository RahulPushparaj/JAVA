package Inheritance;

public class Test1 
{
	int a =10;
	public void m1() {
		System.out.println("m1 is 10");
	}
}
class Test2 extends Test1
{
	int b = 20;
	public void m2() {
		System.out.println("m2 is 20");
	}
}
class Test3 extends Test2
{
	int c = 30;
	public void m3() {
		System.out.println("m3 is 30");
	}
}
class output
{
	public static void main(String[] args) {
		Test3 T = new Test3();
		T.m3();
		T.m2();
		T.m1();
		System.out.println(T.c);
		System.out.println(T.b);
		System.out.println(T.a); 
		System.out.println("***********************************************");
		Test2 D = new Test2();
		D.m2();
		D.m1();
		System.out.println(D.b);
		System.out.println(D.a);
		
	}
	
}