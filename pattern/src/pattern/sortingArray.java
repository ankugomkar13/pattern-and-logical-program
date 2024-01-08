package pattern;


public class sortingArray 
{
	public static void main(String[] args) {
		 int[] arr = {1, 2, 0, 4, 3,0,5,0};

		     for(int i=0; i<arr.length-1; i++) {
		         for(int j=0; j<arr.length-i-1; j++) {
		             if(arr[j] < arr[j+1]) {
		                 // swap the elements
		                 int temp = arr[j];
		                 arr[j] = arr[j+1];
		                 arr[j+1] = temp;
		             }
		         }
		     }

		     // print the sorted array
		     System.out.println("Sorted Array Descending Order: ");
		     for(int i=0; i<arr.length; i++) {

		    	 System.out.println(arr[i]);
		     }

		 }
	}

	

