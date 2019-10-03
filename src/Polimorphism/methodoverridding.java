package Polimorphism;

public class methodoverridding 
{  
	
	public void sub(int a) {
		System.out.println("Rahul="+a);
		

	}

}
class poly extends methodoverridding
{
	
	public void sub(int a) {
	//	super.sub();
		System.out.println("Raja="+a);
		
	}
}

class open
{
	public static void main(String[] args) 
	{
		poly o = (poly) new methodoverridding();
		o.sub(10);
		
	}
}