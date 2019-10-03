package Java_Relationship;

public class composition//Monitor
{
	double res=8.1;
	void display()
	{
		System.out.println("I am in display 1................");
	}
}
	class keyboard
	{
		int nok=106;
		void typing()
		{
			System.out.println("I am in typing...............");
		}
	}
	class computer
	{
		static composition m1=new composition();
		keyboard k1=new keyboard();
	}

	class mainclass11
	{
		public static void main(String[] args)
		{
			System.out.println("***********************************");
			System.out.println("composition res="+computer.m1.res);
			computer.m1.display();
			computer c1=new computer();
			System.out.println("number of keys="+c1.k1.nok);
			c1.k1.typing();
			System.out.println("***********************************");
		}
	}


