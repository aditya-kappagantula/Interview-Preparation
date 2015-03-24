package numbers;

public class ReverseANumber {
	// Input: A number
	// Output: Print reversed number
	public static void main(String[] args) {
		new ReverseANumber(1234);
	}

	public ReverseANumber(int aNumber) {
		System.out.println(reverse(aNumber));
	}

	public int reverse(int aNumber) {
		int remainder = 0;
		int reversedNumber = 0;
		while (aNumber / 10 != 0) {
			remainder = aNumber % 10;
			reversedNumber = reversedNumber * 10 + remainder;
			aNumber = aNumber / 10;
		}
		reversedNumber = reversedNumber * 10 + aNumber;
		return reversedNumber;
	}
}
