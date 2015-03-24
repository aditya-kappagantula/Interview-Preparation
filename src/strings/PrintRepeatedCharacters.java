package strings;

import java.util.Hashtable;
import java.util.Iterator;

public class PrintRepeatedCharacters {
	private String input;

	public PrintRepeatedCharacters(String aString) {
		this.input = aString;
		printRepeatedCharacters(input);
	}

	public void printRepeatedCharacters(String aString) {
		Hashtable<Character, Integer> anHT = new Hashtable<Character, Integer>();
		for (int i = 0; i < aString.length(); i++) {
			if (anHT.containsKey(aString.charAt(i))) {
				anHT.put(aString.charAt(i), anHT.get(aString.charAt(i)) + 1);
			} else {
				anHT.put(aString.charAt(i), 1);
			}
		}
		Iterator<Character> i = anHT.keySet().iterator();
		while (i.hasNext()) {
			char aChar = i.next();
			if (anHT.get(aChar) > 1) {
				System.out.println(aChar);
			}
		}
	}

	public static void main(String[] args) {
		new PrintRepeatedCharacters("aditya");
	}
}
