package CoreJavaPackage;

public class Palindrom {
public static void main(String[] args) {
	
	String s="mammm			";
	String s2="";
	for(int i=s.length()-1;i>=0;i--) {
		s2=s2+s.charAt(i);
		//System.out.println(s2);
	}if(s2.equals(s)) {
		System.out.println("palindrom");
		
	}else {
		System.out.println("not");
	}
	
	}
}

  