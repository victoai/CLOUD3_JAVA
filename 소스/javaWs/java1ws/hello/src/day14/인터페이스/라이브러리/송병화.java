package day14.인터페이스.라이브러리;

public class 송병화 implements MyRunnable{
	
	

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("벌써 목요일이라니~");
	}
	
	public void SBHrun(MyRunnable r) {
		r.run();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		송병화 s = new 송병화();
		s.run();
	
//		익명 인터페이스
		s.SBHrun(new MyRunnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("완전 럭키비키니시티잖아~ ◝(・▿・)◜");
			}
		});
	}

}
