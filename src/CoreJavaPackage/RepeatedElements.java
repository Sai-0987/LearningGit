package CoreJavaPackage;

public class RepeatedElements {

	public static void main(String[] args) {
		 int arr[]= {1,2,2,4,1,6,7,7,6};
		 
		 for(int i=0;i<arr.length;i++) {
			 for(int j=i+1;j<arr.length;j++) {
				 
				 if(arr[i]!=arr[j]) {
					 System.out.println(arr[i]);
				 }
			 }
				 
			 
		 }
	}

}
