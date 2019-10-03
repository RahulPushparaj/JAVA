package Interface;

interface cal
{
	double pi=3.14;//global constant
	int add  (int a,int b);
	int sub    (int a,int b);
}
class mycal implements cal
{
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
}
class mainclass1
{
	public static void main(String[] args) 
	{
		System.out.println("********************************************");
		System.out.println(cal.pi);
		//cal c1 = new cal();
		mycal mc1 = new mycal();
		System.out.println(mc1.add(10,20));
		System.out.println(mc1.sub(20,10));
		cal c1 = new mycal();
		//upcasting
		System.out.println(c1.add(5, 4));
		System.out.println(c1.sub(5, 4));
		System.out.println("********************************************");
	}
}
