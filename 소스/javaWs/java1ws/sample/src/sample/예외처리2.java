package sample;

 

	public class 예외처리2 {
	    public static void methodC() {
	        System.out.println("methodC 실행");
	        int result = 10 / 0;  // 예외 발생  , 자동으로 상위로 전파됨 
	    }

	    public static void methodB() {
	        System.out.println("methodB 실행");
	        methodC();  // methodC 호출
	    }

	    public static void methodA() {
	        System.out.println("methodA 실행");
	        methodB();  // methodB 호출
	    }

	    public static void main(String[] args) {
	    	/*
	    	try {
	        methodA();  // methodA 호출
	    	}catch( Exception e) {
	    		System.out.println(e.getMessage());
	    	}
	    	*/
	    	methodA();  // methodA 호출
	    }
	}

 
