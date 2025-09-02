package day23.추가;

public class 지갑 {
	
	long money=1000000l;
	
	
	
	public long tip() {
		money -=5000;
		return  50000;
	}
	
	
	public void  display() {
		System.out.println( money);
	}
	
}
