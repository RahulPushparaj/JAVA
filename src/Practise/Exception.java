package Practise;

public class Exception 
{
	public static void main(String[] args) 
	{
		try 
		{
			int[] a = {1,2,3};
			System.out.println(a[3]);	
		} 
		catch (StringIndexOutOfBoundsException e)
		{
			System.out.println("String");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array");
		}
		catch (Throwable e)
		{
			System.out.println("Throwable");
		}
		finally 
		{
			System.out.println("Finally");
		}
	}
}
