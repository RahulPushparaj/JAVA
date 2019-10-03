package object_class;

class mainclass2 
{
	static double price = 25;
		   String c = "orange";
		   
	static void product()
	{
		System.out.println("I am good product");
	}
	void ExperiedDate()
	{
		System.out.println("Experied in 12 months");
	}
}
class marker
{
	public static void main(String []args)
	{
		System.out.println("***************************************");
		System.out.println(mainclass2.price);
		System.out.println(new mainclass2().c);
		mainclass2.product();
		new mainclass2().ExperiedDate();
		
		System.out.println("***************************************");
	}

}
