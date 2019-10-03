package String;

public class StringMethods
{
	public static void main(String[] args) 
	{
		System.out.println("**************************************");
		
		//                    101214161820222426 
		String a = "Pushparaj is Java Developer";
		//          0123456789 1113151719212325
		
		System.out.println("1)."+a.charAt(5));
		System.out.println("2)."+a.indexOf('r'));
		System.out.println("3)."+a.lastIndexOf('r'));
		System.out.println("4)."+a.startsWith("Pushparaj"));
		System.out.println("5)."+a.endsWith("per"));
		System.out.println("6)."+a.contains("j"));
		System.out.println("7)."+a.substring(9));
		System.out.println("8)."+a.length());
		System.out.println("10)."+a.toUpperCase());
		System.out.println("11)."+a.toLowerCase());
		System.out.println("12)."+a.replace('a', '_'));
		System.out.println("13)."+a.trim());
		System.out.println("14)."+a.split(""));
		System.out.println("15)."+a.isEmpty());
		System.out.println("**************************************");
		
		String b = "java";
		String c = "java";
		System.out.println("14)."+b.equals(c));
		System.out.println("15)."+b.compareTo(c));
		System.out.println("16)."+b.equalsIgnoreCase(c));
		System.out.println("17)."+b.compareToIgnoreCase(c));
		System.out.println("**************************************");
		
	}
}
