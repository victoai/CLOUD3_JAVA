package day09.학생과제;

import java.util.Scanner;

public class Num3클래스 {
	
	private String name;
	private int kor;
	private int eng;
	private int avg;
	
	public void 입력(String name, int kor, int eng, int avg) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		avg = (kor+eng)/2;
		this.avg = avg;
	}
	
	public void 출력() {
		System.out.println("이름:"+ name);
		System.out.println("국어점수:"+ kor);
		System.out.println("영어점수:"+ eng);
		System.out.println("평균:"+ avg);
	}
	
}
