package day13.학생.day13.day13;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Acorn {
	
	private String id;
	private String name;
	private String phone;
	
	public Acorn(String id, String name, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	// 출력 형식 차이
	// 속도, 성능 -> BufferedWriter가 System.out.println() 보다 우세
	// 간단한 출력 -> System.out.println()을 사용하는게 더 바람직
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	// 메모리 내에서 문자열을 반복적으로 조작할 때 뛰어난 성능을 보입니다
	// BufferedWriter 혹은 System.out.println()과 결합하여 사용할 수 있습니다
	
	// 이것들도 대용량 데이터를 다루는 알고리즘 문제에서 유용합니다
	StringBuilder sb = new StringBuilder();
	
	public void printInfo() throws IOException {
		// TODO Auto-generated method stub
		sb.append("내 아이디 : ").append(this.getId()).append("\n");
		sb.append("내 이름 : ").append(this.getName()).append("\n");
		sb.append("내 번호 : ").append(this.getPhone()).append("\n");
		bw.write(sb.toString());
		bw.flush();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
