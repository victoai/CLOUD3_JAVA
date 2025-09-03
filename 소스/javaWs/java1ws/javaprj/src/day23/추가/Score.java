package day23.추가;

 
public class Score  implements Comparable<Score>{
	String name;
	int kor;
	int eng;	
	double avg;
	
	
	//생성자 오버로딩 (매개변수가 다른 여러개의 생성자를 말한다)
	public Score() {
		 
	}
	
	//생성자 (특별한  내서드)
	public Score(String name, int kor, int eng) {
	    super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calcAvg();
		
	}

	private void calcAvg() {
		
		int total  = kor+eng;
		avg = total/2;
		
	}
	

	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", avg=" + avg + "]";
	}
 

	@Override
	public int compareTo(Score o) {
		// TODO Auto-generated method stub
		return  this.eng  - o.eng;
	}
	
 
	 
	
	
	

}
