package day13.학생.day13.day13;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class 이상민 extends Acorn{
	
	private String email = "";
	private String grade = "";

	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public 이상민(String id, String name, String phone) {
		super(id, name, phone);
		// TODO Auto-generated constructor stub
	}
	
	public 이상민(String id, String name, String phone, String email, String grade) {
		super(id, name, phone);
		this.email = email;
		this.grade = grade;
	}

	@Override
	public void printInfo() throws IOException {
		// TODO Auto-generated method stub
		sb.append("내 아이디 : ").append(this.getId()).append("\n");
		sb.append("내 이름 : ").append(this.getName()).append("\n");
		sb.append("내 번호 : ").append(this.getPhone()).append("\n");
		
		if (!email.equals("")) sb.append("내 이메일 : " + this.email + "\n");
		else sb.append("이메일 정보가 없습니다" + "\n");
		if (!grade.equals("")) sb.append("내 학년 : " + this.grade + "\n");
		else sb.append("학년 정보가 없습니다" + "\n\n");
		
		bw.write(sb.toString());
		bw.flush();
		sb.setLength(0);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		super.setId(id);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return super.getPhone();
	}

	@Override
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		super.setPhone(phone);
	}
	
	
}
