package day08.학생;

import java.util.Arrays;

public class YJM {

	public static void sort(int[] arr){
		for(int i=0; i<arr.length - 1; i++) {
			for(int j=0; j<arr.length - i - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println("정렬 완료");
		System.out.println(Arrays.toString(arr));
	}
}
