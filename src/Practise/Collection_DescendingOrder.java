package Practise;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_DescendingOrder 
{
	public static void main(String[] args) 
	{
		int[] a = {5,3,7,1,2,9,8,6,4};
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer i : a) 
		{
			list.add(i);
		}
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
