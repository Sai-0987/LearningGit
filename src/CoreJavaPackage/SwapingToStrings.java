package CoreJavaPackage;

public class SwapingToStrings {

	public static void main(String[] args) {
		String a="java";
		String b="Programe";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("b :"+b);
		System.out.println("a :"+ a);
		
		
	}
}
