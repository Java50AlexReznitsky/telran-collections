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
//		long res = 1;
//		if(b < 0) {
//			throw new IllegalArgumentException("degree cannot be a negative");
//		}
//		if(b > 0) {
//			res = a * pow(a, b - 1);
//		}
//		return res;
		// TODO
		// HW #17 definition
		// Write methods pow with following limitations
		// Arithmetic operations allowed + - only;
		// if Addition functions applied, then only with the same limitations
		return 0;
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

	public static void displayReverseArray(int[] ar) {
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
		//TODO
		/*returns x ^ 2
		 * With following limitations
		 * No cycles
		 * no any additional methods
		 * no static fields
		 * only + - arithmetic operations
		 */
		 
		return 0;
	}
}
