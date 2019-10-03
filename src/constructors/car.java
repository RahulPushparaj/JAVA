package constructors;
public class car 
{
	double price;
	int modelnumber;
	car(int A,double B)
	{
		System.out.println("creating car object.....");
		modelnumber=A;
		price=B;
	}

static class mainclass123
{
	public static void main(String[] args)
	{
		System.out.println("********************************");
		car bolero=new car(12345,3000.0);
		System.out.println("model of  bolero="+bolero.modelnumber);
		System.out.println("price of bolero="+bolero.price);
		car swift=new car(98765,4000.0);
		System.out.println("model of swift="+swift.modelnumber);
		System.out.println("price of swift="+swift.price);
		System.out.println("********************************");
	}
}
}
