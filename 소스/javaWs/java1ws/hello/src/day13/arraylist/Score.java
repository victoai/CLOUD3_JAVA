package day13.arraylist;

public class Score {

	String name;
	int kor;
	int eng;
	
	
	public Score(String name, int kor, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	
	 public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getKor() {
		return kor;
	}



	public void setKor(int kor) {
		this.kor = kor;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	@Override
	public String toString() {
		 return name + " "  + eng + " " + kor;
	}
	 
	 
	 public void printInfo() {
		 System.out.println( name);
		 System.out.println( kor);
		 System.out.println( eng);
	 }
	
}