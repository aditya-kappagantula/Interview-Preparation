package strings;
public class ReverseAString {
	// Input: Any case-sensitive string
	// Output: Reversed case-sensitive string
	public static void main(String[] args) {
		new ReverseAString("Aditya");
	}

	public ReverseAString(String aString) {
		reverse(aString);
	}

	public void reverse(String aString) {
		char[] letters = new char[aString.length()];
		for (int i = 0; i < letters.length; i++) {
			letters[i] = aString.charAt(i);
		}
		char temporaryCharacter;
		for (int i = 0; i < letters.length / 2; i++) {
			temporaryCharacter = letters[i];
			letters[i] = letters[letters.length - i - 1];
			letters[letters.length - i - 1] = temporaryCharacter;
		}
		System.out.println(new String(letters));
	}
}
