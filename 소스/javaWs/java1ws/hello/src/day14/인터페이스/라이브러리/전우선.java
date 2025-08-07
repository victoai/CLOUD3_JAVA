package day14.인터페이스.라이브러리;

public class 전우선 implements MyRunnable {
	
	@Override
	public void run() {
		
		int[] arr = {2, 4, 6, 8, 10};
		
		int sum = 0;
		
		for (int num : arr) {
			sum += num;
		}
		
		System.out.println("배열의 요소들의 합계 : " + sum);
	
	}

}
