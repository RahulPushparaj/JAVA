package Practise;

import java.util.LinkedHashSet;

import Collection.Set;

public class Collection_RemoveDuplicates 
{
	public static void main(String[] args) 
	{	
		int[] a = {10,20,80,30,40,50,10,20,70,90,20};
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		for (Integer i : a) 
		{
			set.add(i);
		}
		System.out.println(set);
	}
}
