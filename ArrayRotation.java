package AJP;

public class ArrayRotation {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5};
		int x=3;
		
		for(int i=arr.length;i>=arr.length-x;i--) {
			System.out.println(arr[i]);
		}
  for(int i=0;i<arr.length-x;i++) {
	  System.out.println(arr[i]);
  }
	}

}
