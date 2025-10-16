package CoreJavaPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class main {
	
	public static void main(String[] args) {
		ArrayList< Integer> l=new ArrayList<>();
		
		l.add(12);
		l.add(99);
		l.add(123);
		System.out.println("Before Sorting" +l);
		
		Collections.sort(l,new Comparator1());
		System.out.println("After Soring "+ l);
	}}
	
public class Comparator1 implements Comparator<Integer> {

	@Override
	public int compare(Integer i, Integer j) { 
		if(i>j) {
			return -1;
		}
		if(i<j) {
			return 1;
		}
		return 0;
	}
}
