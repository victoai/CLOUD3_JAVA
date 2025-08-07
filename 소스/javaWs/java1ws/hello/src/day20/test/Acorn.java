package day20.test;

public class Acorn  implements Comparable {
	
	String name;
	String address;
	int no;
	@Override
	public String toString() {
		return "Acorn [name=" + name + ", address=" + address + ", no=" + no + "]";
	}
	public Acorn(String name, String address, int no) {
		super();
		this.name = name;
		this.address = address;
		this.no = no;
	}
	// 정렬의 기준을 정하기 
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub  //번호,이름 , 주소 
		Acorn acorn  = (Acorn) o;
		
		
		int result  =this.no  - acorn.no;   // 기준이 크면 양수가 전달됨 
		 
		
		return result;
	}
	
	

}
