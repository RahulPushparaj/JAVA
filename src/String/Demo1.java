package String;

public class Demo1
{
	public static void main(String[] args) 
	{
		char ch[] = {'a','b','c','d','e'};
		String s1 = new String();
		String s2 = new String("abcde");
		String s3 = new String(ch);
		System.out.println("*****************************************");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s2.equals(s3));
		System.out.println("*****************************************");
	}

}
