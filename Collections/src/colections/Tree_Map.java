package colections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Tree_Map {
	public static void main (String args[])
	{
	TreeMap<Integer,String> map= new TreeMap<>();
	map.put(1, "Sourabh");
	map.put(15, "Arka");
	map.put(12, "Matt");
	map.put(110, "Drew");
	map.put(12, "Shauwn");
	
	//Traverse
    for(Entry<Integer, String> m:map.entrySet())
    	{
    	  System.out.println("Key :"+m.getKey()+" Value:"+m.getValue());
    	}
	}
}
