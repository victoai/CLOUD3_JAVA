package day15.정렬;

import java.util.Arrays;

public class 버블정렬 {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 3};
        bubbleSort(numbers);
        System.out.println("정렬된 배열: " + Arrays.toString(numbers));
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
        	
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
