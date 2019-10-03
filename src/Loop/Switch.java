package Loop;



//to create calculator based on switch
public class Switch
{
	public static void main(String[] args)
	{
		System.out.println("***************************************");
		int a = 2;
		int b = 3;
		String s = "per";
		switch(s)
		{
		case "add":System.out.println("Answer="+(a+b));
		break;
		
		case "sub":System.out.println("Answer="+(b-a));
		break;
		
		
		case "mult":System.out.println("Answer="+(a*b));
		break;
		
		
		case "div":System.out.println("Answer="+(b>a));
		break;
		
		case "per":System.out.println("Answer="+(b<a));
		break;
		
		default:
		System.out.println("NONE OF THESE");
	}
		System.out.println("***************************************");
	}
} 

