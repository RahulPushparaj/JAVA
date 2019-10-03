package Practise;

import java.util.LinkedHashMap;

public class TrimReapeatedCharacter_Count 
{
	public static void main(String[] args) 
	{
		String s = "mynameispushparaj";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for(int i = 0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			if(map.containsKey(ch))
			{
				Integer cou = map.get(ch);
				map.put(ch, cou+1);
			}
			else 
			{
				map.put(ch, 1);
			}
			
		}
		System.out.println(map);
	}

}
