package day23.추가;

import java.util.Scanner;

public class 상품관리프로그램작성3 {
	
	static 	Scanner sc = new Scanner (System.in);	
	static  String[] goods = new String[5];
	static int index=0;	
	
	
	public static void main(String[] args) {		
		
			loop:while( true) {			
					System.out.println( "메뉴를 선택하세요 1. 등록, 2.조회 , 3.변경, 4.삭제 ,5. 종료");
					String menu  = sc.nextLine();
					
					switch( menu) {
					case "1":
						등록하기(  );				
						break;
					case "2":				
						조회하기( );				
						break;
					case  "3":
						변경하기( );			
						break;				
					case "4":
						삭제하기( );
						break;
					case "5":
						System.out.println("종료");				
						break loop;
					default :
						System.out.println(" 잘못된 메뉴");
						//프로그램 종료
						System.exit(0);			
					}			
				} 
		
			}
		
			public static void 삭제하기( ) {
				System.out.println("삭제"); // 요소 0으로 저장함 
				조회하기( );
				System.out.println(" 삭제할 상품을 선택하시오");
				String choice_ =sc.nextLine();   // "1 "
				int choice  =  Integer.parseInt( choice_);   // 1
				goods[choice-1]="0";
			}
		
			public static void 변경하기(  ) {
				System.out.println( "변경");				
				조회하기(  );					
				System.out.println("변경할 상품을 선택하세요"); 
				String choice_  =  sc.nextLine();    // "1" =>1
				int choice  = Integer.parseInt(choice_);
				System.out.println("변경할 상품의 이름을 입력하세요");
				String newName  = sc.nextLine();
				goods[choice-1] = newName;
			}
		
			public static int 등록하기(  ) {
				System.out.println("등록할 상품을 입력하세요");
				String name = sc.nextLine();
				goods[index]= name;
				index++;
				return index;
			}
		
			public static void 조회하기( ) {
				System.out.println( "상품을 조회합니다");
				for( int i=0; i< index;  i++) {
					if( !goods[i].equals("0")) {											 
						System.out.println((i+1) + goods[i]);
					}					 
				}
			}

}