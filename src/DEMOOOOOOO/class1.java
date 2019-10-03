package DEMOOOOOOO;

public class class1 
{
	int a = 10;
	public void maths() {
		System.out.println("Maths is 10");
	}
}
class class2 extends class1
{
	int b = 20;
	public void english() {
		System.out.println("English is 20");
	}
	
}
class class3 extends class2
{
	int c = 30;
	public void tamil() {
		System.out.println("Tamil is 30");
	}
}
class subjectdetails
{
	public static void main(String[] args) 
	{
		class3 c3 = new class3();
		System.out.println(c3.a);
		System.out.println(c3.b);
		System.out.println(c3.c);
		c3.maths();
		c3.english();
		c3.tamil();
		
	}
}