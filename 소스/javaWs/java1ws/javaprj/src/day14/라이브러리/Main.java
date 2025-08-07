package day14.라이브러리;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLib1 lib  = new MyLib1();
		lib.printStar();
		lib.printChar('c');
		
		lib.세번실행하기( new WJY() );
		
		lib.세번실행하기(new  MyRun() {

			@Override
			public void run() {

				System.out.println("3단");
				
				for( int i=1; i<=9; i++) {
					System.out.println(3*i);
				}
				
			}});
				
		
		lib.세번실행하기( new KMH());
		lib.세번실행하기( new  LSM());
		
		lib.세번실행하기(new  MyRun() {

			@Override
			public void run() {

				System.out.println("3단");
				
				for( int i=1; i<=9; i++) {
					System.out.println(3*i);
				}
				
			}});
		
		
		
		lib.세번실행하기( new PSK());
		lib.세번실행하기(new LDW());
		lib.세번실행하기(  new CJT1());
		lib.세번실행하기( new JYS());
		lib.세번실행하기( new KYM());
		
		lib.세번실행하기( new MyRun() {

			@Override
			public void run() {
				 
				 System.out.println("탑쌓기");

			        for (int i = 1; i <= 40; i++) {
			           
			            for (int j = 1; j <= i; j++) {
			                System.out.print("*");  
			            }
			            System.out.println();
			        }
				
				
			}});
		
		
		//람다식
		lib.세번실행하기( ()-> {
			
			System.out.println("2.단");
			System.out.println("hi");
			
		});
		
		
	}

}
