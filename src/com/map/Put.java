package com.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Put {
	
	
	public static void main(String[] args) {
		
		Map<Integer,String> m=new LinkedHashMap<>();
		
		m.put(10, "kalpava");
		m.put(20, "savi");
		m.put(30,"revathi");
		m.put(20, "thilaga");
		m.put(50, "abirami");
		m.put(40, "kalpana");
		
		System.out.println(m);
		
		int size = m.size();
		System.out.println(size);
		
		String string = m.get(40);
		System.out.println(string);
		
		String remove = m.remove(20);
		System.out.println(remove);
		
		boolean containsKey = m.containsKey(30);
		System.out.println(containsKey);
		
		boolean containsValue = m.containsValue("revathi");
		System.out.println(containsValue);
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);
		
		Set<Entry<Integer,String>>entrySet = m.entrySet();
		System.out.println(entrySet);
		
		System.out.println("********************************************");
		
		System.out.println("enhanced for loop");
		for(Entry<Integer,String>entry:entrySet) {
			System.out.println(entry);
		}
		
		System.out.println("**************************");
	
		for(Entry<Integer,String> y:entrySet){
			
			System.out.println(y.getKey());
			System.out.println(y.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
