package CoreJavaPackage;

import java.util.Arrays;

public class SrtingArray {
	public static void main(String[] args) {

		int arr[] = { 9, 10, 6, 3, 1, 3, 5 };

		int min = arr[0]; // 15
		int max = arr[0]; // 15

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];

			}
			if (arr[i] < min) {
				min = arr[i];

			}
		}
		System.out.println(max);
		System.out.println(min);
	}

}
