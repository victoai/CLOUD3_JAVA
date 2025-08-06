package day09.학생과제;

public class Num2클래스 {
	
	private long orderNum;
	private String orderId;
	private String orderCal;
	private String orderName;
	private String orderPrNum;
	private String orderplace;
	
	
	public void 입력() {
		
		this.orderNum = 201803120001L;
		this.orderId = "abc123";
		this.orderCal = "2018년3월12일";
		this.orderName = "홍길순";
		this.orderPrNum = "😛D0345-12";
		this.orderplace = "서울시 영등포구 여의도동 20번지";
	}
	
	public void 출력() {
		System.out.println("주문번호:"+ orderNum);
		System.out.println("주문자아이디:"+ orderId);
		System.out.println("주문날짜:"+ orderCal);
		System.out.println("주문자이름:"+ orderName);
		System.out.println("주문상품번호:"+ orderPrNum);
		System.out.println("배송주소:"+ orderplace);
	}
	
}
