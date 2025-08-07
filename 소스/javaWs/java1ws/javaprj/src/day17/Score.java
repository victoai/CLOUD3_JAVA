package day17;

public class Score {
	
	String name;
	int kor;
	
	
	public Score(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}


	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + "]";
	}
	
	

}
