package UserDefinedException;

public class rahul extends Exception
{
	@Override
	public String getMessage()
	{
		return "Employee not Found";
	}
}
