package Collection;

import java.util.ArrayList;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("***********************************************");
		ArrayList<Integer> stu = new ArrayList<Integer>();
		stu.add(10);
		stu.add(40);
		stu.add(30);
		stu.add(10);
		stu.add(20);
		System.out.println(stu);
		for(int i=0;i<stu.size();i++)
		{
			System.out.println(stu.get(i));
		}
		System.out.println();
		for(Integer x:stu)
		{
			System.out.println(x);
		}
		System.out.println("***********************************************");
	}
}







