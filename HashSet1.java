package com.java.collection;

import java.util.*;

public class HashSet1 {

	public static void main(String[] args) {
		
		 Set<Integer> id= new HashSet<>();
		 id.add(1);
		 id.add(1);
		 id.add(2);

		 System.out.println(id);
		 
		 
		 id.forEach(e->System.out.println(e));
		 
		 for(int i : id) {
			 System.out.println(i);
		 }
	}

}
