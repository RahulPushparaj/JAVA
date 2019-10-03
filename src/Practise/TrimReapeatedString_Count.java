package Practise;

import java.util.LinkedHashMap;

public class TrimReapeatedString_Count
{
	public static void main(String[] args)  
	{
		String a = "welcome to java sql sql java to java";
		String[] s = a.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
		for (String x : s) 
		{
			if(map.containsKey(x))
			{
				Integer cou = map.get(x);
				map.put(x, cou+1);
			}
			else
			{
				map.put(x, 1);
			}
		}
		System.out.println(map);
	}
}
