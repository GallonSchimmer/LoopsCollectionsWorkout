package MapLoops;


import java.util.*;

public class MapLoop {
	
	
	
	public static void main(String[] args){

	Map<String, Integer> newStringIntMap = new  HashMap<String, Integer>();
	
	
	newStringIntMap.put("map number", 1);
	
	for(int i = 1; i < 10; i++) {
		newStringIntMap.put("map number", i);
		System.out.println("this is newStringIntMap: " + newStringIntMap + " this is i : " + i);
	}
	
	System.out.println();
	
	for (Map.Entry<String, Integer> throughTheMap : newStringIntMap.entrySet()) {
		
		System.out.println("the las Map out of the For loop : " + throughTheMap.getKey() + " : " + throughTheMap.getValue()); 
		
	}
	
	System.out.println();
	
	Map<String, String> stringStringMap = new HashMap<String, String>();
	
	stringStringMap.put("Mode 1", "Ionian");
	stringStringMap.put("Mode 2", "Dorian");
	stringStringMap.put("Mode 3", "Phrygian");
	stringStringMap.put("Mode 4", "Lydian");
	stringStringMap.put("Mode 5", "Mixolydian");
	stringStringMap.put("Mode 6", "Aeolian");
	stringStringMap.put("Mode 7", "Locrian");
	
	for (Map.Entry<String, String> getScales : stringStringMap.entrySet()) {
		
		System.out.println("The 7 Modes: " + getScales.getKey() + " : " + getScales.getValue());
	}
		
	}
	
	
	
	
}

//https://www.geeksforgeeks.org/map-interface-java-examples/

