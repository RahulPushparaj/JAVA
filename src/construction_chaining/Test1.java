package construction_chaining;
//super()statement
public class Test1
{
	Test1(int x)
	{
		System.out.print("m1");System.out.println("m2");System.out.println("m3");
	}
}
class Test2 extends Test1
{
	Test2(double d)
	{
		super(123);
		System.out.println("m4");
		System.out.println("m5");
	}
}
class Test3 extends Test2
{
	Test3()
	{
		super(123);
		System.out.println("m6");
	}
}

class mainclass13
{
	public static void main(String[] args)
	{
		Test3 t1=new Test3();
	}  
}