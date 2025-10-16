package CoreJavaPackage;

public class ReversingArray {
	public static void main(String[] args) {
		int[] arr = { 12, 43, 54, 9, 11 };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}

}
