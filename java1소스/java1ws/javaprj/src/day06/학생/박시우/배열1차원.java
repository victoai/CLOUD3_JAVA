package day06.학생.박시우;

public class 배열1차원 {
	public static void main(String[] args) {
		//배열 선언 및 생성
		int[] arr = new int[5];
		int arr2[] = new int[5];
		
		//arr, arr2는 참조형 변수이다
		//생성된 배열의 주소를 기억한다
		arr[0]=10;
		arr2[0]=65;
		System.out. println(arr[0]);
		System.out.println(arr2[0]);
		
		//배열 선언 및 초기화 블럭사용 (선언할 때만 사용가능)
		int[] arr3 = {10,6,2};
		int[] arr4 = new int[] {40,2,34};
		
		int[] arr5; //참조형 변수를 선언
		arr5 = new int[3];
	}
}
