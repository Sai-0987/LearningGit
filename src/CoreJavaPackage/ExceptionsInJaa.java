package CoreJavaPackage;

import java.io.FileReader;

public class ExceptionsInJaa {
	@SuppressWarnings("null")
	public static void main(String[] args) throws Exception{
		
		FileReader f=new FileReader("abc.txt");
		try {
			String s=null;
			int i = s.length();
			System.out.println(s);	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ended");
	}
	
	

}
