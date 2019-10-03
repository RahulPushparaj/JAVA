package method_overridding;

public class car 
{
	public void Innova() {
		System.out.println("Innova First Model");
	}
}
class bike extends car
{
	public void Innova() {
		System.out.println("Innova Second Model");
	}
}
class vechicle
{
	public static void main(String[] args) 
	{
		car v1 = new car();
		v1.Innova();
		
		bike v2 = new bike();
		v2.Innova();
		
		
	}
}