


public class overload1
{
	int x;
	double y;
	overload1()
	{
		System.out.println("I am in sample1()...........");
	}
	overload1(int arg1)
	{
		System.out.println("I am in sample2(int)...........");
		x=arg1;
	}
	overload1(int arg1,double arg2)
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
		
		overload1 s1=new overload1();
		System.out.println("X value="+s1.x);
		System.out.println("X value="+s1.y);
		overload1 s2=new overload1(101);
		System.out.println("X value="+s2.x);
		System.out.println("X value="+s2.y);
		overload1 s3=new overload1(10,222.22);
		System.out.println("X value="+s3.x);
		System.out.println("X value="+s3.y);
		
		System.out.println("*********************************");
	}
}

