package day12.상속_inheritance.음료마시기;

public class Main {

	public static void main(String[] args) {
		
		
		 
		AcornStudent[]  list = new AcornStudent[24];
		
		list[0] = (AcornStudent) new 주형준();
		list[1] = new KCW();
		list[2] = new 김솔();
		list[3] = new 송수빈();
		list[4] = new 이효진();
		list[5] = new 김세현();
		list[6] = new 김정석();
		list[7] = new 하예진();
		list[8] = new 황지영();
		list[9] = new 김세중();
		list[10] = new 김무궁();
		list[11] = new 용지민();
		list[12] = new 김도현();
		list[13] = new 장경호();
		list[14] = new 전지형();
		list[15] = new 주상길();
		list[16] = new 전우선();
		list[17] = new 최문길();		
		list[18] = new 정보란();
		list[19] = new 백바울();
		list[20] = new 송병화();
		list[21] = new 소병학();
		list[22] = new 최형진();
		list[23] = new 이상민();
		
		
		
		
		for( int i=0; i< list.length ; i++) {
			  list[i].음료마시기() ;
			  
			 /* 
			  if( list[i] instanceof 이상민) {				  
				  //다운캐스팅 
				  ((이상민)list[i]).단축키();
			  }
			  
			  
			  if(  list[i] instanceof 송수빈) {
				  //다운캐스팅
				 ((송수빈)list[i]).섞기();
			  }
			  
			  */
			  
			   
		}
		
		

	}

}
