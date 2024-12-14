package com.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(23,45,56,87,12,78,9);
		Collections.sort(num);
		Collections.reverse(num);
		
		System.out.println(num);;
		
		//List<Integer>sort = num.stream().sorted().collect(Collectors.toList());
		
		//System.out.println(sort);
		
		
	}

}
