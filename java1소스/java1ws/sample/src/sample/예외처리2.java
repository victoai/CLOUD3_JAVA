package sample;

 

	public class 예외처리2 {
	    public static void methodC() {
	        System.out.println("methodC 실행");
	        int result = 10 / 0;  // 예외 발생
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
	        methodA();  // methodA 호출
	    }
	}

 
