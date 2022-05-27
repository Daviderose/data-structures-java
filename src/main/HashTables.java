package main;

import java.util.Hashtable;

public class HashTables {
	
	public static void main(String[] args) {
		 
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		
		hm.put(1,  "This");
		hm.put(3,  "is");
		hm.put(5,  "a");
		hm.put(7,  "HashTable");
		
		System.out.println(hm.get(1) + " " + hm.get(3) + " " + hm.get(5) + " " + hm.get(7));
	}

}
