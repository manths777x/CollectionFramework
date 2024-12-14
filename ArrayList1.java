package com.java.collection;
import java.util.*;


public class ArrayList1 {

	public static void main(String[] args) {

		List<String> flower= Arrays.asList("jasmine","rose","lily");
		
		ArrayList<String> flower2= new ArrayList<>();
		flower2.add("lily");
		flower2.add("rose2");
		flower2.add("MANOH");
		
		System.out.println(flower2.get(0));
		
		
		ArrayList<String> f3 = new ArrayList<>(flower); 
		
		f3.addAll(flower2);
		System.out.println(f3);
		
	}

}
