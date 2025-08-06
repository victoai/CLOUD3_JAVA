package day18;

public class Hap {
	
	int num;
	int total;
	
	public Hap(int num) {
		this.num  = num;
		
		calc();
	}
	
	private void calc() {
      for( int i=1; i<= num; i++) { 
			 total += i;
		}
	}
	
	public String toString() {
		return  num +  " " + total;
	}

}
