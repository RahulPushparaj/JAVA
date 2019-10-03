package construction_chaining;

public class A 
{
	int x=10;
}
class B extends A
{
	int x=100;
	void tekst()
	{
		int x=1000;
		String q="rahul";
		System.out.println("Local Variable="+x);
		System.out.println("Local Variable="+q);
		System.out.println("Current Class Variable="+this.x);
		System.out.println("Super Class Variable="+super.x);
	}
}
class mainclass 
{
	public static void main(String[] args)
	{
		B b1=new B();
		b1.tekst();
	}
}
