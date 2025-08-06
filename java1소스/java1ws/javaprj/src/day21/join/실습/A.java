package day21.join.실습;


//1~50까지 더하기 
public class A  extends Thread{
	
	private int sum;
	
	
	
	public int getSum() {
		return sum;
	}



	@Override
	//1~50까지 더하기 
	public void run() {
		// TODO Auto-generated method stub
		for( int i=1; i<=50;i++) {
			sum = sum + i; // sum+=i;
			//System.out.println( getName()+ "=" + sum);
		}		
		 
	}

}
