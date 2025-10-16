package CoreJavaPackage;

import java.util.Arrays;

public class Anagrams {
public static void main(String[] args) {
	String s="ran";
	String s1="nar";
	char[] cs = s.toCharArray();
	char[] cs2 = s1.toCharArray();
	Arrays.sort(cs);
	
	Arrays.sort(cs2);
	System.out.println(Arrays.equals(cs, cs2));
	
}
}
