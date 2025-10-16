package CoreJavaPackage;

public class SwappingArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int temp=0;
		for(int i=arr.length-1	;i>0-1;i--) {
			
			arr[temp]=arr[i];
			temp++;
		 System.out.println(arr[i]);
		}
	}

}
