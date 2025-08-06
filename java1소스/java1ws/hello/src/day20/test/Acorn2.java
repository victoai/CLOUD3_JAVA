package day20.test;

public class Acorn2  implements Comparable<Acorn2> {
	
	String name;
	String address;
	int no;
	@Override
	public String toString() {
		return "Acorn [name=" + name + ", address=" + address + ", no=" + no + "]";
	}
	public Acorn2(String name, String address, int no) {
		super();
		this.name = name;
		this.address = address;
		this.no = no;
	}
	// 정렬의 기준을 정하기 
	 
	@Override
	public int compareTo(Acorn2 o) {
		// TODO Auto-generated method stub
		return  this.no- o.no;
	}
	
	

}
