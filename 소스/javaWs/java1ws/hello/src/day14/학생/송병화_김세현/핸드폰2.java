package day14.학생.송병화_김세현;

import java.util.Scanner;

public class 핸드폰2 implements 전화, 카메라, 계산기 {
	String 기종;
	String 색상;
	String 무게;
	String 크기;
	String 비밀번호 = "0000";
	
	public 핸드폰2(String 기종, String 색상, String 무게, String 크기) {
		this.기종 = 기종;
		this.색상 = 색상;
		this.무게 = 무게;
		this.크기 = 크기;
	}

	@Override
	public String toString() {
		return "핸드폰 기종=" + 기종 + ", 색상=" + 색상 + ", 무게=" + 무게 + ", 크기=" + 크기;
	}
	
	@Override
	public void 사진찍기() {
		// TODO Auto-generated method stub
		System.out.println("찰칵");
	}

	@Override
	public void 동영상찍기() throws InterruptedException {
		// TODO Auto-generated method stub
		try {
			System.out.println("동영상을 촬영중입니다.");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.sleep(3000);
		
		System.out.println("동영상이 촬영되었습니다");
	}

	@Override
	public void 전화걸기() throws InterruptedException{ 
		System.out.println("전화번호를 입력하세요");
		String n = new Scanner(System.in).nextLine();
		// TODO Auto-generated method stub
		try {
			System.out.println(n + "으로 전화거는중...");
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(3000);
		
		System.out.println("상대가 전화를 받지않습니다.");
	}

	@Override
	public void 전화받기() {
		// TODO Auto-generated method stub
		System.out.println("전화를 받습니다");
	}

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
	}

	@Override
	public void minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
	}

	@Override
	public void multiply(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
	}

	@Override
	public void divide(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
	}
}
