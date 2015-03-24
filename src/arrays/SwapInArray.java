package arrays;

public class SwapInArray {
	public int[] intArray;
	public char[] charArray;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4 };
		new SwapInArray(1, 3, array);
	}

	public SwapInArray(int firstPosition, int secondPosition, int[] anArray) {
		intArray = swapInArray(firstPosition, secondPosition, anArray);
	}

	public SwapInArray(int firstPosition, int secondPosition, char[] anArray) {
		charArray = swapInArray(firstPosition, secondPosition, anArray);
	}

	public int[] swapInArray(int firstPosition, int secondPosition, int[] input) {
		input[firstPosition] = input[firstPosition] + input[secondPosition];
		input[secondPosition] = input[firstPosition] - input[secondPosition];
		input[firstPosition] = input[firstPosition] - input[secondPosition];
		return input;
	}

	public char[] swapInArray(int firstPosition, int secondPosition,
			char[] input) {
		char temp = input[firstPosition];
		input[firstPosition] = input[secondPosition];
		input[secondPosition] = temp;
		return input;
	}
}
