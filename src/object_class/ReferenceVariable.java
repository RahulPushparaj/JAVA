package object_class;

//classname.static member
//new classname().nonstatic member 
class mainclasss1
{
     int a = 4;
     int b = 6;
	double c = 23.25;
}	

	class ReferenceVariable
	{
	public static void main(String[] args)
	{
		mainclasss1 ko=new mainclasss1();
		mainclasss1 rahul=new mainclasss1();
		System.out.println(ko.a);
		System.out.println(ko.b);	
		//reassign
		ko.a=40;
		ko.b=60;
		ko.c=2335.2555;
		System.out.println(ko.a);
		System.out.println(ko.b);
		System.out.println(ko.c); 
		//reassign
		rahul.a=300;
		rahul.b=400;
		rahul.c=23335656.31799555;
		System.out.println(rahul.b);
		System.out.println(rahul.a);
		System.out.println(rahul.c);
		
	}
}
  