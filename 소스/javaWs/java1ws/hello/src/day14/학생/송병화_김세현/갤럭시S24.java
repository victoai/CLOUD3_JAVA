package day14.학생.송병화_김세현;

import java.util.Scanner;

public class 갤럭시S24 extends 핸드폰2 {
	static Scanner sc = new Scanner(System.in);

	public 갤럭시S24(String 기종, String 색상, String 무게, String 크기) {
		super(기종, 색상, 무게, 크기);
	}

	public void printInfo() {
		System.out.println("핸드폰 기종=" + 기종 + ", 색상=" + 색상 + ", 무게=" + 무게 + ", 크기=" + 크기);
	}

	public void run() throws InterruptedException {

		loop:while (true) {
			while (true) {
				System.out.println("비밀번호 4자리를 입력하세요");
				String pwd = sc.nextLine();
				if (!pwd.equals(비밀번호)) {
					System.out.println("비밀번호가 틀렸습니다.");
					continue;
				}
				break;
			}

			while (true) {

				System.out.println("1.카메라 2.전화 3.계산기 4.정보 5.종료 6.비밀번호 변경");
				int option = sc.nextInt();

				switch (option) {
				case 1:
					System.out.println("1.사진찍기 2.동영상찍기");
					int i = sc.nextInt();
					if (i == 1) {
						사진찍기();
					} else if (i == 2) {
						동영상찍기();
					} else {
						System.out.println("잘못된 입력입니다.");
					}
					break;
				case 2:
					전화걸기();
					break;
				case 3:
					System.out.println("두 수를 입력하세요");
					int a = sc.nextInt();
					int b = sc.nextInt();
					sc.nextLine();
					System.out.println("연산자를 입력하세요");
					String s = sc.nextLine();

					switch (s) {
					case "+":
						add(a, b);
						break;
					case "-":
						minus(a, b);
						break;
					case "*":
						multiply(a, b);
						break;
					case "/":
						divide(a, b);
						break;
					default:
						System.out.println("잘못된 입력입니다.");
					}
					break;
				case 4:
					printInfo();
					break;

				case 5:
					System.out.println("종료합니다");
					System.exit(0);
				case 6:
					sc.nextLine();
					System.out.println("변경하실 비밀번호 4자리를 입력하세요");
					비밀번호 = sc.nextLine();
					
					System.out.println("비밀번호가 변경됐습니다.");
					System.out.println("변경된 비밀번호를 다시 입력해주세요.");
					continue loop;
				default:
					System.out.println("잘못된 입력입니다.");
					break;
				}
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		갤럭시S24 s = new 갤럭시S24("갤럭시S24", "마블그레이", "196g", "16인치");
		s.run();
	}

}
