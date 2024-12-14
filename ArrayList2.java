package com.java.collection;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {

		List<String> course = Arrays.asList("C", "C++", "Java","Python", "Go");
		
		for(int i=0; i<course.size();i++) {
			System.out.print( course.get(i)+  "  ");
		}
		
		for(String i : course) {
			System.out.println(i);
		}
		
		course.stream().forEach(c-> System.out.print(c));
		
		
	}

}
