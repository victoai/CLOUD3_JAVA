package day08.학생_구조화된자료형;

public class FruitInfo {

	public static void main(String[] args) {
		Fruit f = new Fruit();
		f.name = "사과";
		f.flavor="사과맛";
		
		String[] info = aa(f);
		for(int i=0; i<info.length; i++) {
			System.out.println(info[i]);
		}

	}
	
	public static String[] aa(Fruit f) {
		String[] info = new String[2];
		info[0] = f.name;
		info[1] = f.flavor;
		return info;
	}
	
	

}
