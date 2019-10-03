package Type_Casting;
//Method Overridding With Upcasting

public class A
{
	void rahul()
	{
		System.out.println("Hi........................");
	}
}
class B extends A
{
	void rahul()
	{
		System.out.println("Bye.......................");
	}
}
class mainclass5
{
	public static void main(String[] args) 
	{
		System.out.println("*************************************");
		A a1 = new A();
		a1.rahul();
		B b1 = new B();
		b1.rahul();
		A a11 = new B();
		//Implicit Upcasting
		a11.rahul();
		System.out.println("*************************************");
	}
}
 