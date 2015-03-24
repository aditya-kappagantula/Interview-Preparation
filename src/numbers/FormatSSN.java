package numbers;

public class FormatSSN {
	// Input: A number and separator points array
	// Output: Reverse the number separated at points mentioned in the array and
	// appended by separator character
	// Eg: Input: 4083389575 and [4,2,3,1]
	// Eg: Output: 9575-38-083-4
	private char separator = '-';
	private int ssn;
	private int[] anArray;

	public FormatSSN(int aNumber, int[] anArray) {
		this.ssn = aNumber;
		this.anArray = anArray;
		formatSSN(ssn, anArray);
	}

	public void formatSSN(int aNumber, int[] anArray) {
		StringBuilder input = new StringBuilder("" + aNumber);
		input = input.reverse();
		String output = "";
		System.out.println(input);
		for (int i = 0; i < anArray.length; i++) {
			output += input.substring(output.length() - i, output.length()
					+ anArray[i] - i) + '-';
		}
		output = output.substring(0, output.length() - 1);
		System.out.println(output);
	}

	public static void main(String[] args) {
		int[] anArray = { 2, 3, 3, 1 };
		new FormatSSN(408338957, anArray);
	}
}
