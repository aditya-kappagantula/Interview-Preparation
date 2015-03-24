package sorts;

import arrays.SwapInArray;

public class Sort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 3, 1, 5 };
		new Sort().bubbleSort(input);
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

	public void bubbleSort(int[] input) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length - 1; j++) {
				if (input[j] > input[j + 1]) {
					new SwapInArray(j, j + 1, input);
					// swapInArray(j, j + 1, input);
				}
			}
		}
	}
}
