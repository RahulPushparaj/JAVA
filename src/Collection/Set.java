package Collection;

import java.util.HashSet;

public class Set 
{
	public static void main(String[] args) 
	{
		System.out.println("*************************************************");
		HashSet<Integer> stu = new HashSet<>();
		stu.add(10);
		stu.add(20);
		stu.add(10);
		stu.add(30);
		stu.add(15);
		System.out.println(stu);
		System.out.println(stu.size());
		stu.remove(15);
		System.out.println(stu);
		for(Integer x:stu)
		{
			System.out.println(x);
		}
		System.out.println("*************************************************");
	}

}
