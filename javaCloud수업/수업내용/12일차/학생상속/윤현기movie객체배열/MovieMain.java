package chap_07.chap_01_class1.Ex05;

import com.sun.source.tree.WhileLoopTree;
/*
3. 메인 메소드에서:
        - 최소 3개의 영화를 추가
        - 영화 검색 기능 테스트
        - 평균 평점 출력
        - 특정 년도 영화 목록 출력
*/
import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie();
        MovieManager movieManager = new MovieManager();

        while (true){
            System.out.println("메뉴를 선택하세요. 1.영화저장 , 2.조회 , 3.영화찾기 , 4.점수평균 , 5.년도검색 , 6.수정하기");
            int chooseNum = sc.nextInt();
            switch (chooseNum){
                case 1:
                    movieManager.addMoive();
                    break;
                case 2:
                    movieManager.searchMovie();
                    break;
                case 3:
                    movieManager.findMovieTitle();
                    break;

                case 4:
                    movieManager.getAverageRating();
                    break;

                case 5:
                    movieManager.getMoviesByYear();
                    break;

                case 6:
                    movieManager.modifyMovies();
                    break;

                default:
                    System.out.println("시스템을 종료합니다.");
                    sc.close(); //스케너 종료
                    return; // 프로그램 종료
            }
        }
    }
}
