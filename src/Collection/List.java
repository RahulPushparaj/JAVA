package Collection;

import java.util.ArrayList;

public class List
{
	public static void main(String[] args) 
	{
		System.out.println("***********************************************");
		ArrayList stu = new ArrayList();
		stu.add(10);
		stu.add("Name");
		stu.add("True");
		stu.add(10);
		stu.add(20);
		System.out.println(stu);
		System.out.println(stu.size());
		System.out.println(stu.get(1));
		stu.add(2, 15);
		System.out.println("After Adding::"+ stu);
		System.out.println(stu.size());
		stu.remove(4);
		System.out.println("After Remove::"+ stu);
		stu.set(3, 35);
		System.out.println("After Replace::"+ stu);
		//stu.clear();
		//System.out.println(stu);
		boolean empty = stu.isEmpty();
		System.out.println(empty);
		int indexOf = stu.indexOf(20);
		System.out.println(indexOf);
		int lastIndexOf = stu.lastIndexOf(10);
		System.out.println(lastIndexOf);
		System.out.println(stu);
		System.out.println("***********************************************");
		ArrayList<Integer> emp = new ArrayList<Integer>();
		emp.addAll(stu);
		System.out.println(emp);
		boolean contains = stu.contains(202);
		System.out.println(contains);
		boolean containsAll = stu.containsAll(emp);
		System.out.println(containsAll);
		stu.add(20);
		emp.add(40);
		System.out.println(stu);
		System.out.println(emp);
		emp.retainAll(stu);
		System.out.println(emp);
		stu.removeAll(emp);
		System.out.println(stu);
		System.out.println("***********************************************");
		
	}

}
