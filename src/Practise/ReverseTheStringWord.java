package Practise;

class ReverseTheStringWord
{
	public static void main(String[] args) 
	{
		String s = "I am Automation Tester";
		String[] sp = s.split(" ");
		
		for (int i = sp.length-1; i >= 0; i--)
		{
			System.out.print(sp[i]+" ");
		}	
	}
}
/*
class ReverseTheStringWord
{ 
	public static void main(String[] args) 
	{
		String s = "I am Automation Tester";
		String temp = "";
		String[] sp = s.split(" ");
		
		for (int i = sp.length-1; i >= 0; i--)
		{
			temp = temp+(sp[i]+" ");
		}
		System.out.println(temp);	
	}
}
*/
