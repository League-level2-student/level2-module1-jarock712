package intro_to_array_lists;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> monsters = new ArrayList<String>();
		//2. Add five Strings to your list
		monsters.add("Vampire");
		monsters.add("Zombie");
		monsters.add("Banshee");
		monsters.add("Bigfoot");
		monsters.add("Hydra");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < monsters.size(); i++) {
			String s = monsters.get(i);
			System.out.println("My favorite mythical monsters are " + i + " " + s);
		}
		System.out.println("\n");
		//4. Print all the Strings using a for-each loop
		for(String s : monsters){
			System.out.println(s);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < monsters.size(); i++) {
			
		}
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
