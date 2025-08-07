package day12.상속_inheritance.춤추기;

public class Main {

	public static void main(String[] args) {		
		
		Student[]  students  = new Student[20];				
		//
		 students[0] = new  JSK();   //주상길
		 students[1] = new  Jsk2();  //김정석	     
		 students[2] = new  Ksh(); // 
		 students[3] = new  YJM();  
		 students[4] = new  CMG();  
		 students[5] = new  jws();  
		 students[6] = new  KSJ();  
		 students[7] = new  Ksh();  
		 students[8] = new  HJY();  
		 students[9] = new  hyj();  
		 students[10] = new  SSB();  
		 students[11] = new  Hyojin(); 
		 students[12] = new  Kmg();  
		 students[13] = new  Jh();  
		 students[14] = new  SBH(); 
		 students[15] = new  JKH(); //
		 
		 
		  students[16] = new  CHJ2();  
	      students[17] = new  LSM();  
		  students[18] = new  JBR();  
		  students[19] = new  ksol(); 
		// students[19] = new  Paulbaek();  
		// students[20] = new  Paulbaek();  
		// students[21] = new  Paulbaek(); 
		// students[22] = new  Paulbaek();  
	 
		  
		
		
		//Student 상속받은 자식객체들을 Student배열로 다루면서 일괄적으로 명령을 줄 수 있다.
		for( int i=0; i< students.length  ; i++) {
			 students[i].춤추기();			 
			 
			 if(  students[i]  instanceof HJY ) {
				 System.out.println("<<<<<<<<<<<<<<<<HJY 기능 >>>>>>>>>");
				 ((HJY) students[i]).왁킹();   //다운캐스팅
			 }
			 
		}
		

	}

}
