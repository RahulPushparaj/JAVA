package UserDefinedException;

public class Program1 
{
	public static void main(String[] args) 
	{
		try 
		{
			throw new rahul();
		} 
		catch (rahul e)
		{
			e.printStackTrace();
		}
	}
}
