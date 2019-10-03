package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;

import org.omg.Messaging.SyncScopeHelper;

import java.util.Set;

public class Map 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> stu = new HashMap<>();
		stu.put(10, "Rahul");
		stu.put(10, "Anu");
		stu.put(20, "Anitha");
		stu.put(30, "Anitha");
		stu.put(40, "poori");
		stu.put(40, "poori");
		stu.put(10, "Dhakshaya");
		stu.put(40, "Anitha");
		System.out.println(stu);
		System.out.println(stu.size());
		System.out.println(stu.get(40));
		boolean a = stu.containsKey(20);
		System.out.println(a);
		boolean b = stu.containsValue("Anhitha");
		System.out.println(b);
		Set<Integer> c = stu.keySet();
		System.out.println(c);
		Collection<String> d = stu.values();
		System.out.println(d);
		Set<Entry<Integer,String>> e = stu.entrySet();
		System.out.println(e);
		for(Entry<Integer, String> entry:e)
		{
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			System.out.println();
			
		}
	}

}
