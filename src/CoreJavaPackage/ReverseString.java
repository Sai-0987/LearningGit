package CoreJavaPackage;

public class ReverseString {

	public static void main(String[] args) {
		String s="Hello world ";
		String[] sb = s.split(" ");
		//System.out.println(array);//
		for(int i=0;i<sb.length;i++) {
			String x=sb[i];
		StringBuffer si=new StringBuffer(x);
		si.reverse();
		System.out.print(si.toString() +"-") ;
		
		}
		
	}

}
