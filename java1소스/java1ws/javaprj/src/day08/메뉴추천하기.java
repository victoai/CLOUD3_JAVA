package day08;

public class 메뉴추천하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String result  =메뉴추천하기();
		System.out.println( result );

	}
	
	
    public static   String 메뉴추천하기() {
		
		String[] menu = new String[] { "돈까스" ,"제육"  , "짜장면"  ,"카레라이스"  ,"우동 김밥" };
		                 //   Math.random()  => 1미만의 임의의 실수형 데이터   
		int index  =   (int) (Math.random() * menu.length);
		
		String result = menu[index];
		
		return result;
		
	}
	

}
