package day17.프로젝트;

public class BubbleSort {
	
	
	
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;

        // 배열의 끝까지 반복
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // 인접한 두 요소를 비교하고, 필요시 교환
            for (int j = 0; j < n - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // 요소 교환
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }

            // 교환이 일어나지 않았다면 배열이 이미 정렬된 상태이므로 종료
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Before sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        bubbleSort(numbers);

        System.out.println("\nAfter sorting:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
