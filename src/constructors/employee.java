package constructors;
//CONSTENTS IN JAVA
public class employee 
{
	static String company="Google";
	int id;
	String name;
	double salary;
	employee(int id,String name,double salary)
	{
		System.out.println("Employee(int,string,double)..............");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	employee(int id,String name)
	{
		System.out.println("Employee(int,string).....................");
		this.id=id;
		this.name=name;
	}
	void displa()
	{
		System.out.println("Employee ID="+id);
		System.out.println("Employee NAME="+name);
		System.out.println("Employee SALARY="+salary);
	}
}
class mainclass10
{
	public static void main(String[] args)
	{
		System.out.println("*****************************************");
		System.out.println("welcome to  "+employee.company);
		employee e1 = new employee(1234,"Rahul",100000.0);
		e1.displa();
		employee e2 = new employee(9876,"Pushparaj");
		e2.displa();
		System.out.println("*****************************************");
	}
}
