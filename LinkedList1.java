package com.java.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkedList1 {

	public static void main(String[] args) {

		LinkedList<String> game= new LinkedList<>();
		game.add("GTA");
		game.add("COD");
		game.add("NFMW");
		game.addFirst("COC");
		
		
		System.out.println("Initial List "+game);
		
		//game.remove(2);
		
		boolean isPresent= game.contains("W");
		System.out.println(isPresent);
		
		
		for(String e:game) {
			System.out.println(e);
			
		}
		
		game.forEach(e->System.out.print(e));
		
	}

}
