package Package;

import Block.ThirdProgarm;
	
public class FirstProgram {
	int p = 2;
	int o =5;
	int c =o+p;
	
	public void add()
	{
		System.out.println(c);
		
		System.out.println("ADD");
	}
	public static void main(String[] args) 
	{
		FirstProgram a = new FirstProgram();
		a.add();
		SecondProgram b = new SecondProgram();
		b.sub();
		b.multiple();
		ThirdProgarm c = new ThirdProgarm();
		c.divide();
		
	}
}
