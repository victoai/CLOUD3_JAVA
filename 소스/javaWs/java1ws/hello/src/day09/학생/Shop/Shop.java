package day09.학생.Shop;

public class Shop {
	
	
	 static int outer = 150000;
	 static int top = 30000;
	 static int bottom = 25000;
	 static int shoes = 99000;
	 static int cap = 15000;
	 
	 
	 
	   String grade;
	   int order_total;
	 
	 
	 
	 
	
	
	public void order(int outer, int top, int bottom, int shoes, int cap) {
		
	    int outerAmt = this.outer *  outer  ;	     
		int  topAmt = this.top * top;
		int bottomAmt =  this.bottom * bottom;
		int shoesAmt = this.shoes * shoes;
		int capAmt = this.cap * cap;
		
		
		order_total =  outerAmt + topAmt + bottomAmt + shoesAmt + capAmt ;
			
	}
	
	public void printTotal() {
		/* System.out.println(outer);
		System.out.println(top);
		System.out.println(bottom);
		System.out.println(shoes);
		System.out.println(cap);
		*/
		System.out.println("총 주문 금액:" + order_total);
		
		
	}
	
	
	
	public void shopGrade() {
		if(order_total>=1000000) {
			grade = "VVIP";
		}else if(order_total>=700000) {
			grade = "VIP";
		}else if(order_total>=500000) {
			grade = "Gold";
		}else if(order_total>=250000) {
			grade = "Silver";
		}else if(order_total>=100000) {
			grade = "Bronze";
		}else {
			grade = "Welcome";
		}
		System.out.println("회원 등급 - " + grade);
	}

}
