package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class DEMO 
{
	public static void main(String[] args) 
	{
		Hashtable<Integer, String> s = new Hashtable<>();
		s.put(90, "Rahul");
		s.put(60, "Push");
		s.put(30, "Push");
		s.put(90, "Gopi");
		s.put(20, "Greens");
		System.out.println(s);
		System.out.println(s.get(20));
		Set<Integer> k = s.keySet();
		System.out.println(k);
		Collection<String> v = s.values();
		System.out.println(v);
		s.put(70, "pushparaj");
		System.out.println(s);
		Set<Entry<Integer,String>> e = s.entrySet();
		for (Entry<Integer, String> e1 : e)
		{
			System.out.println(e1);
			
		}
		
		
	}

}
