package com.java.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap1 {

	public static void main(String[] args) {

		Map<Integer, String> zp=new HashMap<>();
		zp.put(1, "Aditya");
		zp.put(2, "Akansha");
		zp.put(3, "Manthan");
		zp.put(4, "Pritam");
		zp.put(5, "Suraj");
		
		
		Set<Integer> keySet = zp.keySet();
		Collection<String> values = zp.values();
		
		
		System.out.println(keySet);
		System.out.println(values);
		
		
		zp.forEach((k, v) -> {
			System.out.println("Key:"+ k + "  Value:"+ v);
		});
		
		
		
		
		
		
	}

}
