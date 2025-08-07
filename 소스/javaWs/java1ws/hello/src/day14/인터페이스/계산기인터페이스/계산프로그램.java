package day14.인터페이스.계산기인터페이스;

import java.util.Scanner;

public class 계산프로그램 {

	CalculatorI cal;
	 
	
	
	public void setCal(CalculatorI cal) {
		this.cal = cal;
	}



	public void run() {
		//시작
			Scanner sc = new Scanner( System.in);
			System.out.println(" 두수 입력하세요" );
			int su1 = sc.nextInt();
			int su2 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.println("연산자를 입력하세요" );
			
			String op  = sc.nextLine();
			
			
			switch(op) {
			case "+" :				 
				 int result =cal.add(su1, su2);
				System.out.println( result);
				break;
			case "-":				 
				int result2  = cal.sub(su1, su2);
				System.out.println(result2);
				
			}		
	}


	public static void main(String[] args) {
		 
		계산프로그램  p = new 계산프로그램();
		//p.setCal( new LGCalculator());
	   // p.setCal( new 다이소Calculator());
		//  p.setCal( new 문구점Calculator());
		  //p.setCal( new 김세현Claculator());
		//  p.setCal( new 문구점Calculator());
      // p.setCal( new JSCalculator());
		// p.setCal( new KMGCalculator());
		//   p.setCal( new PaulCalculator());
	    //p.setCal( new HyjCalculator());
		 p.setCal( new MockCalculator());
		p.run();
		

	}

}
