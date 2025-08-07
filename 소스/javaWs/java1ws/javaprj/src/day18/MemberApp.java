package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Member {
	
    private String id;
    private String password;
    

    
    public Member(String id, String password ) {
    	
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("아이디는 필수 입력 사항입니다.");
        }
        if (password == null || password.length() < 6) {
            throw new IllegalArgumentException("비밀번호는 6자 이상이어야 합니다.");
        }
     

        this.id = id;
        this.password = password; 
        
        
    }

    
    public String getId() {
        return id;
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }

     
}


class MemberService {
    private ArrayList<  Member> list = new ArrayList<>();
    private Member loggedInMember = null;
    private Scanner scanner = new Scanner(System.in);

    
    // 회원 등록
    public void register() {
    	
        while (true) {
            try {
                System.out.print("아이디 입력: ");
                String id = scanner.nextLine(); 

                System.out.print("비밀번호 입력(6자 이상): ");
                String password = scanner.nextLine();

                System.out.print("이름 입력: ");
                String name = scanner.nextLine();

                Member newMember = new Member(id, password );
                
                //
                list. add(  newMember);
                System.out.println("회원 가입 완료!");
                break;
                
                
            } catch (IllegalArgumentException e) {
                System.out.println("오류: " + e.getMessage());
            }
        }
    }

    // 로그인
    public void login() {
        while (true) {
            System.out.print("아이디 입력: ");
            String id = scanner.nextLine();
            Member member = null;
            if ( (member=findMemberById(id)) == null) {
                System.out.println("존재하지 않는 아이디입니다. 다시 입력하세요.");
                continue;
            }

            System.out.print("비밀번호 입력: ");
            String password = scanner.nextLine();
         

            if (!member.checkPassword(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력하세요.");
                continue;
																																																																																																																																																																																																																																																																									            }
																																																																																																																																																																																																																																																																									
																																																																																																																																																																																																																																																																									            loggedInMember = member;
																																																																																																																																																																																																																																																																									            System.out.println( " 로그인 성공!");
            break;
        }
    }

    
    private Member findMemberById(String id) {
        for (Member member : list) {
            if (member.getId().equals(id)) {
                return member;
            }
        }
        return null;
    }
    // 로그인된 회원 정보 출력
    public void printLoggedInUser() {
        if (loggedInMember == null) {
            System.out.println("현재 로그인된 사용자가 없습니다.");
        } else {
            System.out.println("현재 로그인된 사용자:  ");
        }
    }

    public void run() {
        while (true) {
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 로그인된 사용자 확인");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    register();
                    break;
                case "2":
                    login();
                    break;
                case "3":
                    printLoggedInUser();
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 선택입니다. 다시 입력하세요.");
            }
        }
    }
}


public class MemberApp {
    public static void main(String[] args) {
        MemberService service = new MemberService();
        service.run();
    }
}
