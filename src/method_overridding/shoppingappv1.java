package method_overridding;

public class shoppingappv1 
{
	void payment()
	{
		System.out.println("COD..................");
	}
}
class shoppingappv2 extends shoppingappv1
{
	void payment()
	{
		System.out.println("card.................");
	}
}
class mainclass15
{
	public static void main(String[] args)
	{
		 shoppingappv1  v1=new  shoppingappv1();
		 v1.payment();
		 shoppingappv2 v2=new  shoppingappv2();
		 v2.payment();
	}
}
