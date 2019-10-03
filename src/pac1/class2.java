package pac1;

import pac2.class3;

public class class2
{
	public void div() {
		System.out.println("Divide");
	}
	public void mul() {
		System.out.println("Multiple");
	}
	public static void main(String[] args) 
	{
		class2 A = new class2();
		A.div();
		A.mul();
		
		class1 B = new class1();
		B.add();
		B.sub();
		
		class3 C = new class3();
		C.maths();
		
	}

}
