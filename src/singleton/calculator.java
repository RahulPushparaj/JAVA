package singleton;

public class calculator 
{
	private static calculator calci = new calculator();
	private void calculator()
	{
		System.out.println("calculator object is created.....");
	}
	public static calculator getcalculator() 
	{
		return calci;
	}
	//some methods
}
//hrraji.jobssure@gmail.com