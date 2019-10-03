package object_class;

//classname.static member
//new classname().nonstatic member 
class mainclass1
{
    static int a = 5;
		   int b = 6;
	
	static void z1()
	{
		System.out.println("I am in qspider.......");
	}
	void z2()
	{
		System.out.println("I am in jspider.......");
	}
}
	class object
	{
	public static void main(String[] args)
	{
		System.out.println("***********************************");
		
		System.out.println(mainclass1.a);
		new mainclass1().z2();
		System.out.println(new mainclass1().b);
		new mainclass1().z2();

		System.out.println("***********************************");
	}
}
