package com.java.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashCode2 {

	public static void main(String[] args) {

		Map<Integer, StudentName> data = new HashMap<>();
		
		data.put(101, new StudentName("Abhishek", "Lakade"));
		data.put(102, new StudentName("Khushal", "Patil"));
		data.put(103, new StudentName("Shivam", "Nerkar"));
		data.put(104, new StudentName("Manthan", "Patil"));
		
		Set<Integer> keySet = data.keySet();
	
		
		System.out.println(data);
	}

}
