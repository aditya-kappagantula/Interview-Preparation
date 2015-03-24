package strings;
public class PrintAllSubstrings {
	public static void main(String[] args) {
		new PrintAllSubstrings("Aditya");
	}

	public PrintAllSubstrings(String aString) {
		printAllSubstrings(aString);
	}

	public void printAllSubstrings(String aString) {
		for (int i = 0; i < aString.length(); i++) {
			for (int j = 1; j < aString.length() - i + 1; j++) {
				System.out.println(aString.substring(i, i + j));
			}
		}
	}
}
