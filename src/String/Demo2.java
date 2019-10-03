package String;

public class Demo2 
{
	public static void main(String[] args) 
	{
		System.out.println("**************************************");
		String s1 = "Rahul";
		String s2 = "Rahul";
		String s3 = new String("Rahul");
		String s4 = new String("Rahul");
		System.out.println(s1==s2);
		System.out.println(s4==s3);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s3));
		System.out.println("**************************************");
		
	}

}
