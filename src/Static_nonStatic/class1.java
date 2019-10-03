package Static_nonStatic;

public class class1 extends class2
{
	static String x = "Pushparaj";
	static String y = "push";
	public static void sub() 
	{
		System.out.println("I am Sub");
		System.out.println(x);
		System.out.println(y);
	}
	public static void main(String[] args) 
	{
		sub();
		add();
		class2.add();
		
		
	}

}
