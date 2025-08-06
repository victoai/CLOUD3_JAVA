package day17;

import java.util.Arrays;

public class 퀵소트 {

	
	
	public static void quicksort( int[] arr, int low, int high) {
		
		if( low < high) {
			int p =  partiton( arr, low, high);
			
			quicksort(arr, low, p-1);
			quicksort(arr, p+1, high);
			
		}
	}
	private static int partiton(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		int pivot  = arr[high];
		int i= low-1;
		
		for( int  j=low ; j<=high-1; j++) {
			if( arr[j] <  pivot) {
				i++;
				swap( arr, i, j);
			}
		}
		
		
		swap( arr, i+1 , high);
		return i+1;
	}
	private static void swap(int[] arr, int i, int j) {
		 
		int tmp;
		tmp = arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr= {2,6,11,3,4};
		
		quicksort(arr, 0, arr.length-1);
		
		
		System.out.println( Arrays.toString(arr));
		

	}

}
