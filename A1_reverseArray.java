package array;

public class A1_reverseArray {

	public static void reverseArr(int[] arr) {
		int length = arr.length;
		int start = 0;
		int end = length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		reverseArr(arr);

	}
}
