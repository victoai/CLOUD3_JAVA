package day18;

import java.util.Arrays;

public class MyDrink {

	// String[] drink  =   { "딸기스무디" , "아메리카노" ,"라떼"} 
	String[] drink ;
	
	public MyDrink(String[] drink) {
		this.drink  = drink;
		
	}
	 public MyDrink() {
		// TODO Auto-generated constructor stub
		 drink  = new String[]   { "딸기스무디" , "아메리카노" ,"라떼"} ;
	}
		 
	
	@Override
	public String toString() {
	
		return  Arrays.toString(drink);
	}
	
	
	
	public  String[] 음료정보가져오기() {
		
		return drink;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] arr = {"포도" , "망고쥬스" ,"아이스티"};		
		//MyDrink m  = new MyDrink( new String[] {"딸기스무디" , "아메리카노" ,"라떼"});
		MyDrink m  = new MyDrink(  arr);
		
		System.out.println( m.toString());
		
		MyDrink m2 = new MyDrink();
		
		System.out.println( m2.toString());
		
		String[] result  =m2.음료정보가져오기();
		
		
		for( String str : result) {
			
			System.out.println( str);
		}
		

	}

}
