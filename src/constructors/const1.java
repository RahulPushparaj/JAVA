package constructors;

public class const1 
{
	public const1() {
		System.out.println("I am in constructor");
		
	}
	
	public const1(int a,String b)
	{
		System.out.println("I arugument int ");
		System.out.println("I am String");
	}
	private void const1(int i)
	{
		System.out.println(i);
	}
	public static void main(String[] args)  
	{
		const1 c = new const1();
		const1 c1 = new const1();
		c.const1(20);
	}
}
