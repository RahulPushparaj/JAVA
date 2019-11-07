class A
{
	public int a = 1;
	private int b = 2;
	protected int c = 3;
	int d = 4;
}
public class Abc 
{
	
	public static void main(String[] args)
	{
		A o = new A();
		System.out.println(o.a);
	//	System.out.println(o.b);
		System.out.println(o.c);
		System.out.println(o.d);
	}
}
