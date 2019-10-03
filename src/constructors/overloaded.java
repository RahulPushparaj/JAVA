package constructors;

public class overloaded 
{
	int x;
	double y;
	overloaded()
	{
		System.out.println("I am in sample1()...........");
	}
	overloaded(int arg1)
	{
		System.out.println("I am in sample2(int)...........");
		x=arg1;
	}
	overloaded(int arg1,double arg2)
	{
		System.out.println("I am in sample3(int,double)............");
		x=arg1;
		y=arg2;
	}
}
class mainclass9
{
	public static void main(String[] args)
	{
		System.out.println("*********************************");
		
		overloaded s1=new overloaded();
		System.out.println("X value="+s1.x);
		System.out.println("X value="+s1.y);
		overloaded s2=new overloaded(1011111111);
		System.out.println("X value="+s2.x);
		System.out.println("X value="+s2.y);
		overloaded s3=new overloaded(10,222.22);
		System.out.println("X value="+s3.x);
		System.out.println("X value="+s3.y);
		
		System.out.println("*********************************");
	}
}
