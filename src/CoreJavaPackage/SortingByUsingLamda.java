package CoreJavaPackage;

import java.util.Arrays;
import java.util.List;

public class SortingByUsingLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(12,14,100,66,88);
		//list.stream().sorted().forEach(System.out::println);
		list.stream().sorted((i,j)->j.compareTo(i)).forEach(System.out::println);
	}

}
