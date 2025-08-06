package day13.학생.상속_정보란_실습.상속_정보란_실습;

public class Main {

	public static void main(String[] args) {
		
		고양이키우기 a = new Cat_mom();
		고양이키우기 b = new Baby_cat();
		
		((Cat_mom)a).분유먹일준비();
		((Baby_cat)b).분유먹을준비();
		
		
		고양이키우기[] arr = new 고양이키우기[2];
		arr[0] = new Cat_mom();
		arr[1] = new Baby_cat();
		
		for(int i=0; i< arr.length; i++) {
			arr[i].분유먹이기();
		}
		

	}

}
