package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class

    	ArrayList<String> strings = new ArrayList<>();
        // 2. Add five Strings to your list
    	strings.add("a");
    	strings.add("b");
    	strings.add("c");
    	strings.add("de");
    	strings.add("e");
    	System.out.println("\n");
        // 3. Print all the Strings using a standard for-loop
    	for(int i = 0; i<strings.size(); i++) {
    		System.out.println(strings.get(i));
    	}
    	System.out.println("\n");
        // 4. Print all the Strings using a for-each loop

    	for(String i : strings) {
    		System.out.println(i);
    	}
    	System.out.println("\n");
        // 5. Print only the even numbered elements in the list.

    	for(int i = 0; i<strings.size(); i++) {
    		if(i%2==0) {
    			System.out.println(strings.get(i));
    		}
    	}
    	System.out.println("\n");
        // 6. Print all the Strings in reverse order.

    	for(int i = strings.size()-1; i>=0; i--) {
    		System.out.println(strings.get(i));
    	}
    	System.out.println("\n");
        // 7. Print only the Strings that have the letter 'e' in them.
    	boolean contains;
        for(String i : strings) {
        	contains = false;
        	for(int j = 0; j<i.length(); j++) {
        		if(i.charAt(j) == 'e') {
        			contains = true;
        		}
        	}
        	if(contains) {
        		System.out.println(i);
        	}
        }
    }
}
