package day18;

import java.util.Arrays;

public class 뮉정렬2 {
	
	
	public static  void quick( int[] arr, int low, int high) {
		
		if( low < high) {
			int p = partition( arr, low, high);
			
			
			quick( arr, low, p-1);
			quick( arr, p+1 , high);
		}
		
		
	}
	
	
	private static  int partition(int[] arr, int low, int high) {
		 
		int pivot  =  arr[high];
	    int i=low-1; 
	   
	
		
		
		for(int j=low; j<=high ; j++) {
			
			if( arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		
		swap(arr,  i+1,  high);
		
		return  i+1;
	}


	private static  void swap(int[] arr, int i, int j) {
		int temp;
		temp  = arr[i];
		arr[i]=arr[j];
		arr[j] = temp;
		
	}


	public static void main(String[] args) {		
	
		
		int[] arr= {6,3,11,9,8,4};
		
		quick(arr, 0 , arr.length-1);
		
		System.out.println(  Arrays.toString(arr));
		
		
		
		
		
	}

}
