package telran.recursion;

public class LinearRecursion {
	public static void function(int a) {
		if (a > 3) {
			function(a - 1);
		}
	}

	public static long factorial(int n) {
		long res = 1;
		if (n < 0) {
			throw new IllegalArgumentException("factorial exits only for positive and 0");
		}
		if (n > 0) {
			res = n * factorial(n - 1);
		}
		return res;
	}

	public static long pow(int a, int b) {

		long res = 1;
		if (b < 0) {
			throw new IllegalArgumentException("degree cannot be a negative");
		}
		if (b > 0) {
			res = a * pow(a, b - 1);
		}
		return res;
		// TODO
		// HW #17 definition
		// Write methods pow with following limitations
		// Arithmetic operations allowed + - only;
		// if Addition functions applied, then only with the same limitations
//		return 0;
	}

	public static void displayArray(int[] ar) {
		displayArray(0, ar, false);
	}

	private static void displayArray(int index, int[] ar, boolean isReverse) {
		if (index < ar.length) {
			if (isReverse) {
				displayArray(index + 1, ar, isReverse);
				System.out.print(ar[index] + " ");
			} else {
				System.out.print(ar[index] + " ");
				displayArray(index + 1, ar, isReverse);
			}
		}
	}

	public static void displayReversedArray(int[] ar) {
		displayArray(0, ar, true);
	}

	public static long sumArray(int[] array) {
		return sumArray(0, array);
	}

	private static long sumArray(int index, int[] array) {
		long res = 0;
		if (index < array.length) {
			res = array[index] + sumArray(index + 1, array);
		}
		return res;
	}

	public static void reverseArray(int[] array) {
		reverseArray(0, array, array.length - 1);
	}

	private static void reverseArray(int left, int[] array, int right) {
		if (left < right) {
			int tmp = array[left];
			array[left] = array[right];
			array[right] = tmp;
			reverseArray(left + 1, array, right - 1);
		}
	}

	public static int square(int x) {
		if (x == 0) {
			return 0;
		} else if (x < 0) {
			x = -x;
		}
		return x + square(x - 1) + x - 1;
	}

	public static boolean isSubstring(String string, String substring) {
		String tmp = substring;
		if (string.length() == 0 || substring.length() == 0 || substring.length() > string.length()) {
			return false;
		}
		if (string.charAt(0) == substring.charAt(0) && substring.length() == 1) {
			return true;
		}
		if (string.charAt(0) == substring.charAt(0)) {
			isSubstring(string.substring(1), substring.substring(1));
		} else {
			isSubstring(string.substring(1), substring = tmp);
		}
		return false;
	}

//	public static int index = 0;
//	public static int subIndex = 0;
//	public static int counter = 0;
//
//	public static boolean isSubstring(String string, String substring) {
//		boolean res = false;
//		if (string.length() != 0 && substring.length() != 0 && string.length() >= substring.length()) {
//			res = subString(string, substring) ? true : false;
//		}
//		return res;
//	}
//
//	public static boolean subString(String string, String subString) {
//		boolean res = false;
//		if (index == string.length()) {
//			return false;
//		}
//		if (string.charAt(index) == subString.charAt(subIndex)) {
//			index++;
//			subIndex++;
//			counter++;
//			if (counter == subString.length()) {
//				return true;
//			}
//			subString(string, subString);
//		} else {
//			counter = 0;
//			subIndex = 0;
//			isSubstring(string, subString);
//		}
//		return res;
//	}
	


}
