package strings;
public class StringHasAllUniqueCharacters {
	// Input: A string
	// Output: Print true if string has all unique characters else print false.
	public static void main(String[] args) {
		new StringHasAllUniqueCharacters("aditya");
	}

	public StringHasAllUniqueCharacters(String aString) {
		System.out.println(hasAllUniqueCharacters(aString));
	}

	public boolean hasAllUniqueCharacters(String aString) {
		boolean[] characterSet = new boolean[256];
		for (int i = 0; i < aString.length(); i++) {
			if (characterSet[(int) aString.charAt(i)]) {
				return false;
			}
			characterSet[(int) aString.charAt(i)] = true;
		}
		return true;
	}
}
