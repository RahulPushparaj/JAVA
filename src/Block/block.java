
package Block;

class rahul
{
	static int a,c,f,i;
		   int b,d,e,g,h;
	
static
{
	System.out.println("A is static member");
	a = 2;
}
{
	System.out.println("B is non-static member");
	b = 3;
}
static
{
	System.out.println("C is static member");
	c = 4;
}
{
	System.out.println("D is non-static member");
	d = 5;
}
{
	System.out.println("E is non-static member");
	e = 6;
}
static
{
	System.out.println("F is static member");
	f = 7;
}
{
	System.out.println("G is non-static member");
	g =8;
}
{
	System.out.println("H is non-static member");
	h = 9;
}
static
{
	System.out.println("I is static member");
	i = 10;
}
}
public class block
{
public static void main(String []args)
{
	System.out.println("**********************************");
	rahul m1 = new rahul();
	System.out.print(m1.a);  
	System.out.print(m1.b);
	System.out.print(m1.c);  
	System.out.print(m1.d);
	System.out.print(m1.e);  
	System.out.print(m1.f);
	System.out.print(m1.g);
	System.out.print(m1.h);  
	System.out.println(m1.i); 
	System.out.println("**********************************");
}
}

