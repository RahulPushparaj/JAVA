package Abstract;

abstract class cal
{
	abstract void add(int x,int y);
	abstract void sub(int a,int b);
}
class mycal extends cal
{
	void add(int x,int y)
	{
		System.out.println("sum="+(x+y));
	}
	void sub(int a,int b)
	{
		System.out.println("sub="+(a-b));
	}
}
class mainclass1
{
	public static void main(String[] args) {
		System.out.println("*************************************");
		//cal c1 = new cal();we cant create object
		mycal mc1 = new mycal();
		mc1.add(10, 20);
		mc1.sub(300,175);
		cal c1 = new mycal();
		c1.add(100, 200);
		c1.sub(30, 17);
		
	 	System.out.println("*************************************");
	}
}
