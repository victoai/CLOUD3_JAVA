package day14.라이브러리;

public class LDW implements MyRun{

	@Override
	public void run() {
	//전체 구구단 출력하기
		
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j <=9; j++) {
				
				System.out.println(i + "*" + j + " = " + i*j);
				
;			}
		}
		
	}

}
