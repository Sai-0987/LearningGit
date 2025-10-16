package CoreJavaPackage;

public class pairsEquelto {
	public static void main(String[] args) {

		int[] arr = { 7, 1, 6, 2, 5, 2, 6, 4, 4 };
		int sum = 8;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
System.out.println(arr[i]+"+"+arr[j] +"="+sum);
				}

			}
		}

	}

}
