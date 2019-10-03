package MethodOverloading;

import java.util.HashSet;

public class Rahul {
	public void studentId(int num) {
		System.out.println("12345");
	}

	public void studentId(String name) {
		System.out.println("Rahul");
	}

	public void studentId(boolean b) {
		System.out.println('b');
	}

	public static void main(String[] args) {
		String s="mammeffmlm";
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<s.length()-1;i++) {
			int in = s.indexOf("m", i);
			set.add(in);
		}
		int l = s.lastIndexOf("m");
		set.add(l);
		System.out.println(set);
	}
}

/*
 * 
 * 
 * 
 * public class StudentInfo { private void studentId(int num) { } private void
 * studentId(String name) { \\ depends on order } private void studentId(String
 * email, int ph) { \\depends on data type } private void studentId(int dob,
 * String add) { \\depends on datatype count } public static void main(String[]
 * arg) { StudentInfo info = new StudentInfo(); } }
 */
