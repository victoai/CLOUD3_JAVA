package hello;

public class Ex04 {
	public static void main(String[] args) {
		int tmp=0,sum=0;
		
		for(int i=1; i<100; i+=2) {
			tmp+=i;
			sum+=tmp;
			
			if(sum>1000) {
				System.out.printf("1000을 처음으로 초과한 값은 %d이고 마지막 항은 %d입니다.",sum,i);
				break;
			}
		}
		
	}
}
