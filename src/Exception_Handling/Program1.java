package Exception_Handling;

public class Program1 
{
	public static void main(String[] args) 
	{
		try 
		{
			String s = null;
			System.out.println(s.length());
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println("789654123");
		}
		catch (NullPointerException e)
		{
			System.out.println("55555555555");
		}
		finally 
		{
			System.out.println("Final");
			
		}
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}
}
