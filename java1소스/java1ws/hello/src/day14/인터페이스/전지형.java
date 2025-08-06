package day14.인터페이스;

public class 전지형 implements 많이먹는게가능한{

	@Override
	public void 많이먹다() {
		// TODO Auto-generated method stub
		String lunch;
		String dessert;
		lunch = "육회" + "광어회" + "우럭회" + "냉면";
		dessert = "수박" + "파인애플" + "플레인요거트스무디" + "소화제"; 
		System.out.println(lunch + "" + dessert + "을 많이 먹었다");
	}
}
