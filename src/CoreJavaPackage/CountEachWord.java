package CoreJavaPackage;

public class CountEachWord {
	public static void main(String[] args) {
		String s="I Love my  India ";
		String[] split = s.split(" ");
		int count =0;
		for(int i=0;i<split.length;i++) {
			if(split[i] !=" 		 ") {
					count++;
			}
		}
		System.out.println(count);
	}


}
