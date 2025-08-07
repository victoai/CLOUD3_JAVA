package day17.프로젝트;

public class 퀵소트 {

    public static void quickSort(int[] array, int low, int high) {
    	
        if (low < high) {
            // 피벗 기준으로 배열을 나누고, 피벗의 인덱스를 반환
            int pi = partition(array, low, high);

            // 피벗을 기준으로 왼쪽 부분 배열을 정렬
            quickSort(array, low, pi - 1);
            // 피벗을 기준으로 오른쪽 부분 배열을 정렬
            quickSort(array, pi + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[low]; // 피벗을 첫 번째 요소로 설정

        int i = low; // 피벗보다 작은 값의 인덱스
        int j = high + 1; // 피벗보다 큰 값의 인덱스

        while (true) {
            // 피벗보다 큰 값을 찾기 위한 포인터 이동
            do {
                i++;
            } while (i <= high && array[i] < pivot);

            // 피벗보다 작은 값을 찾기 위한 포인터 이동
            do {
                j--;
            } while (array[j] > pivot);

            // 포인터가 엇갈리면 반복문 종료
            if (i >= j) {
                break;
            }

            // 피벗보다 큰 값과 작은 값을 교환
            swap(array, i, j);
        }

        // 피벗을 정렬된 위치로 이동
        swap(array, low, j);

        return j; // 피벗의 최종 위치를 반환
    }


    // 두 요소의 위치를 교환
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
