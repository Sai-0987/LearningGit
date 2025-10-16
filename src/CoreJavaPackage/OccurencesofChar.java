package CoreJavaPackage;

public class OccurencesofChar {
	public static void main(String[] args) {

		String s = "Javaa";
		
		//char ch = 'a';
		//char[] sd = s.toCharArray();
		int count=0;
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='a') {
				count++;
				System.out.print(s.charAt(i)+"-"+count+" ,");
			}
			
		}
	}
}
