package day13.추상클래스;

public class 춤추기프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Acorn[]  list = new Acorn[17];
		
		
		list[0] = new WJY();
		list[1]= new Lht();
		list[2] = new OYS();
		list[3]= new KMH();
		list[4] = new LDW();
		list[5] = new LJH();
		list[6] = new 춤추기_정연수();
		list[7] = new KJU();
		list[8] = new PSK();
		list[9] = new LSM();
		list[10] = new CJT();
		list[11] = new HYJ();
		list[12] = new CHE();
		 
		
		for( int i=0 ; i< 13 ; i++) {
			list[i].춤추기();
		}

	}

}
