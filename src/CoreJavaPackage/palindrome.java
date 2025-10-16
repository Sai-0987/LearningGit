package CoreJavaPackage;

import java.util.Arrays;

public class palindrome {

	public static void main(String[] args) {
		String s = "DAD";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			// System.out.println(i);
			s1 = s1 + s.charAt(i);
		}
		if (s.equals(s1)) {
			System.out.println("Polindrome");

		} else {
			System.out.println("Not polindrome ");
		}
	}
}
