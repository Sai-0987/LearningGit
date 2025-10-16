package CoreJavaPackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionSorting implements Comparable<T>{
	public static void main(String[] args) {
		int [] arr= {2,4,1,6,7,9,10,3};
		List<int[]> list = Arrays.asList(arr);
		Collections.sort(list);
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
