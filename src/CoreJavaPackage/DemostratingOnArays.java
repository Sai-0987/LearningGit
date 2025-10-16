package CoreJavaPackage;

import java.util.Arrays;

public class DemostratingOnArays {

	public static void main(String[] args) {
		int [ ]arr= {10,9,8,1,4,6,3,7};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println(" ");
		System.out.println("Min Value "+ arr[arr.length-1]);
}
}