package Access_Specifier;



public class FirstProgram 
{
	public int a = 12;
	private int b = 13;
	protected int c = 14;
	int d = 15;
	int z = a+b;
	public static void main(String[] args) 
	{
		FirstProgram f = new FirstProgram();
		System.out.println(f.z);	
	}
}
