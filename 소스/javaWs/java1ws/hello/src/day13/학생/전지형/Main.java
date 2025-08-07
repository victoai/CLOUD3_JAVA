

package day13.학생.전지형;
import java.util.Scanner;


 

public class Main {

	public static void main(String[] args) {
	
		Parent hard = new Parent();
		
		hard.애키우기();
		hard.애키우기_기저귀갈기();
		hard.애키우기_분유먹이기();
		hard.애키우기_애재우기();
		hard.애키우기_애트름시키기();
		
		System.out.println("----------------------------");
	
		Parent baby1 = new Parent();

		baby1 = new Child();

		baby1.애키우기();
		baby1.애키우기_기저귀갈기();
		baby1.애키우기_분유먹이기();
		baby1.애키우기_애재우기();
		baby1.애키우기_애트름시키기();

		System.out.println("----------------------------");
		
		
		Parent[] list2 = new Child[5];
	    
		
		for(int i=0; i<list2.length; i++) {
			list2[i] = new Child();
		}
		
		list2[0].애키우기_애재우기();
		list2[1].애키우기_애트름시키기();
		list2[2].애키우기_분유먹이기();
		list2[3].애키우기();
		list2[4].애키우기_기저귀갈기();
		
		System.out.println("----------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		sc.nextLine();
		
		
		
	}

}
