package JavaBEAMS;

public class mainclass1 
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setid(1234);
		e1.setname("Rahul");
		e1.setsalary(40000.0);
		System.out.println(e1.getid());
		System.out.println(e1.getname());
		System.out.println(e1.getsalary());
	}
}
