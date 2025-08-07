package javaprj;
//일정관리 만들기 등록, 조회, 종료
/*
 // 생성자
// toString 
//세터, 게터 
      
*/

public class oo {
	
	String  title;	//일정 제목 (ex. 콩이랑 산책가기)
    String  date;	//일정 날짜	(ex.3월 4일)
    String  desc;	//일정 참석자 (ex. 혼자, 친구, 가족, 콩이 등등)
    boolean  result;	//일정 완료 여부 Y/N 
	
	/*
	public oo() {
		
	}
	*/
	
	public oo(String title, String date,String  desc) {
		this.title=title;
		this.date=date;
		this.desc=desc;
		this.result=false;	//미완료 상태로 시작
	}
	
	
	public String toString() {
		return "일정 : "+title+"\n"
	+"날짜 : "+date+"\n"
	+ "참석자 : "+desc+"\n"
	+"일정 완료 여부 : "+result;
	}
	
	
	public String toString1() {
		return "일정 완료 여부 : "+(result?"완료":"미완료");
	}
	
	//getter 사용
	public boolean isResult() {
		return result;
	}
	
	//setter 사용
	public void setResult(boolean result) {
		this.result=result;
	}
	
	
}
