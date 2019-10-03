package JavaBEAMS;

public class Employee 
{
	//private data memebers
	private int id;
	private String name;
	private double salary;
	//public default construtor
	public Employee(){}
	//public getters and setters
	public int getid(){
		return id;
	}
	public void setid(int id){
		this.id = id;
	}
	public String getname(){
		return name;
	}
	public void setname(String name){
		this.name = name;
	}
	public double getsalary(){
		return salary;
	}
	public void setsalary(double salary){
		this.salary = salary;
	}
}
