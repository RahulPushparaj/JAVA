package Interface;

interface demo 
{
	int x = 10;
	void m1();
	void m2();
}
class sample implements demo
{
	public void m1()
	{
		
	}
	public void m2()
	{
		
	}
	class mainclass1
	{
		public void main(String[] args) {
			System.out.println(demo.x);
			sample s1 = new sample();
			s1.m1();
			s1.m2();
			//    (OR)     //
			demo d1 = new sample();
			d1.m1();
			d1.m2();
			
		}
	}
}
