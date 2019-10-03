package construction_chaining;
//This()statement

public class Test4 
{
	Test4()
	{
		this(10.5);
		System.out.println("t4");
	}
	Test4(int x)
	{
		System.out.println("t4()");
	}
	
	
	Test4(double d)
	{
		this(10);
		System.out.println("t4(int)");
	}
	
	
	
}
class mainclass14
{
	public static void main(String[] args)
	{
		Test4 t2=new Test4();
		
	}
}