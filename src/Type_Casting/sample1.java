package Type_Casting;
//Class/Reference

public class sample1
{
	int  x=10;
	void rahul()
	{
		System.out.println("I am in rahul()..............");
	}
}
class sample2 extends sample1
{
	int y=20;
	void ani()
	{
		System.out.println("I am in ani()................");
	}
}
class sample3 extends sample2
{
	int z=30;
	void anu()
	{
		System.out.println("I am in anu()................");
	}
}
class sample4 extends sample3
{
	int a=40;
	void poori()
	{
		System.out.println("I am in poori()................");
	}
}
class mainclass3
{
	public static void main(String[] args) 
	{
		System.out.println("**********************************************");
		//upcasting
		//sample s1=(sample1) new sample2();
		//sample s1=new sample2();
		sample3 s3 = new sample3();
		System.out.println(s3.x);
		System.out.println(s3.y);
		System.out.println(s3.z);
		s3.rahul();
		s3.ani();
		s3.anu();
		sample2 s2 = new sample2();
		System.out.println(s2.x);
		System.out.println(s2.y);
		s2.rahul();
		s2.ani();
		sample1 s1 = (sample1)s2;
		System.out.println(s1.x);
		s1.rahul();
		
		System.out.println("**********************************************");
	}
}
